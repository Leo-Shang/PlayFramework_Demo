// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Maoshun/Desktop/mydemo/conf/routes
// @DATE:Wed Jun 26 06:05:27 PDT 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  UserController_1: controllers.UserController,
  // @LINE:16
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    UserController_1: controllers.UserController,
    // @LINE:16
    Assets_0: controllers.Assets
  ) = this(errorHandler, UserController_1, Assets_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, UserController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.UserController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.UserController.listUsers(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.UserController.createUser(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/""" + "$" + """phone<[^/]+>""", """controllers.UserController.edit(request:Request, phone:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/""" + "$" + """phone<[^/]+>/""", """controllers.UserController.deleteUser(request:Request, phone:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/""" + "$" + """phone<[^/]+>""", """controllers.UserController.done(request:Request, phone:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_UserController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_UserController_index0_invoker = createInvoker(
    UserController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Home page""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_UserController_listUsers1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_UserController_listUsers1_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      UserController_1.listUsers(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "listUsers",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """users""",
      """ Users""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_UserController_createUser2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_UserController_createUser2_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      UserController_1.createUser(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "createUser",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """users""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_UserController_edit3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/"), DynamicPart("phone", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_edit3_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      UserController_1.edit(fakeValue[play.mvc.Http.Request], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "edit",
      Seq(classOf[play.mvc.Http.Request], classOf[String]),
      "GET",
      this.prefix + """users/""" + "$" + """phone<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_UserController_deleteUser4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/"), DynamicPart("phone", """[^/]+""",true), StaticPart("/")))
  )
  private[this] lazy val controllers_UserController_deleteUser4_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      UserController_1.deleteUser(fakeValue[play.mvc.Http.Request], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "deleteUser",
      Seq(classOf[play.mvc.Http.Request], classOf[String]),
      "GET",
      this.prefix + """users/""" + "$" + """phone<[^/]+>/""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_UserController_done5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/"), DynamicPart("phone", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_done5_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      UserController_1.done(fakeValue[play.mvc.Http.Request], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "done",
      Seq(classOf[play.mvc.Http.Request], classOf[String]),
      "POST",
      this.prefix + """users/""" + "$" + """phone<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_UserController_index0_route(params@_) =>
      call { 
        controllers_UserController_index0_invoker.call(UserController_1.index)
      }
  
    // @LINE:9
    case controllers_UserController_listUsers1_route(params@_) =>
      call { 
        controllers_UserController_listUsers1_invoker.call(
          req => UserController_1.listUsers(req))
      }
  
    // @LINE:10
    case controllers_UserController_createUser2_route(params@_) =>
      call { 
        controllers_UserController_createUser2_invoker.call(
          req => UserController_1.createUser(req))
      }
  
    // @LINE:11
    case controllers_UserController_edit3_route(params@_) =>
      call(params.fromPath[String]("phone", None)) { (phone) =>
        controllers_UserController_edit3_invoker.call(
          req => UserController_1.edit(req, phone))
      }
  
    // @LINE:12
    case controllers_UserController_deleteUser4_route(params@_) =>
      call(params.fromPath[String]("phone", None)) { (phone) =>
        controllers_UserController_deleteUser4_invoker.call(
          req => UserController_1.deleteUser(req, phone))
      }
  
    // @LINE:13
    case controllers_UserController_done5_route(params@_) =>
      call(params.fromPath[String]("phone", None)) { (phone) =>
        controllers_UserController_done5_invoker.call(
          req => UserController_1.done(req, phone))
      }
  
    // @LINE:16
    case controllers_Assets_versioned6_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
