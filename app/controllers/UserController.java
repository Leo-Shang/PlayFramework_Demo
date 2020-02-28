package controllers;

import models.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import play.data.Form;
import play.data.FormFactory;
import play.i18n.MessagesApi;
import play.mvc.*;
import views.html.edit;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;

import static play.libs.Scala.asScala;

/**
 * An example of form processing.
 *
 * https://playframework.com/documentation/latest/JavaForms
 */
@Singleton
public class UserController extends Controller {

    private final Form<UserData> form;
    private MessagesApi messagesApi;
    private final List<User> users;

    private final Logger logger = LoggerFactory.getLogger(getClass()) ;

    @Inject
    public UserController(FormFactory formFactory, MessagesApi messagesApi) {
        this.form = formFactory.form(UserData.class);
        this.messagesApi = messagesApi;
        this.users = com.google.common.collect.Lists.newArrayList(
                new User("Leo", "Shang", "1234567", "123"),
                new User("Betty", "Huang", "1234568", "123")
        );
    }

    public Result index() {
        return ok(views.html.index.render());
    }

    public Result listUsers(Http.Request request) {
        return ok(views.html.listUsers.render(asScala(users), form, request, messagesApi.preferred(request)));
    }

    public Result createUser(Http.Request request) {
        System.out.println(request);
        final Form<UserData> boundForm = form.bindFromRequest(request);

        if (boundForm.hasErrors()) {
            logger.error("errors = {}", boundForm.errors());
            return badRequest(views.html.listUsers.render(asScala(users), boundForm, request, messagesApi.preferred(request)));
        } else {
            UserData data = boundForm.get();
            users.add(new User(data.getFirstName(), data.getLastName(), data.getPhone(), data.getPassword()));
            return redirect(routes.UserController.listUsers())
                .flashing("info", "A new User added!");
        }
    }

    public Result edit(Http.Request request, String phone) {
        for(User u : users) {
            if (phone.equals(u.phone)){
                Form<UserData> boundForm = form.bindFromRequest(request).fill(new UserData(u.firstName, u.lastName,
                        u.phone, u.password));
                return ok(edit.render(phone, boundForm));
            }
        }
        return notFound();
    }

    public Result done (Http.Request request, String phone) {
        Form<UserData> boundForm = form.bindFromRequest(request);
        User u = new User(boundForm.get().getFirstName(), boundForm.get().getLastName(), boundForm.get().getPhone(),
                boundForm.get().getPassword());
        for(User old : users) {
            if(phone.equals(old.phone)) {
                old.firstName = u.firstName;
                old.lastName = u.lastName;
                old.phone = u.phone;
                old.password = u.password;
                return redirect(routes.UserController.listUsers());
            }
        }
        return notFound();

    }

    public Result deleteUser(Http.Request request, String phone) {
        for (User u : users){
            if(phone.equals(u.phone)){
                users.remove(u);
                break;
            }
        }
        return redirect(routes.UserController.listUsers())
                .flashing("info", "A user deleted!");
    }
}