
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._
/*1.2*/import play.mvc.Http.Request

object listUsers extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Seq[User],Form[UserData],Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(users: Seq[User], form: Form[UserData])(implicit request: Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Users")/*4.15*/ {_display_(Seq[Any](format.raw/*4.17*/("""

    """),format.raw/*6.5*/("""<h1>Users</h1>

    """),format.raw/*8.40*/("""
    """),_display_(/*9.6*/request/*9.13*/.flash.asScala().data.map/*9.38*/ { case (name, value) =>_display_(Seq[Any](format.raw/*9.62*/("""
    """),format.raw/*10.5*/("""<div class=""""),_display_(/*10.18*/name),format.raw/*10.22*/("""">"""),_display_(/*10.25*/value),format.raw/*10.30*/("""</div>
    """)))}),format.raw/*11.6*/("""

    """),format.raw/*13.5*/("""<table>
        <thead>
        <tr><th>  First Name  |  </th><th>  last Name  |  </th><th>  Phone Number  </th>
        </thead>
        <tbody>
        """),_display_(/*18.10*/for(w <- users) yield /*18.25*/ {_display_(Seq[Any](format.raw/*18.27*/("""
            """),format.raw/*19.13*/("""<tr><td>"""),_display_(/*19.22*/w/*19.23*/.firstName),format.raw/*19.33*/("""</td><td>"""),_display_(/*19.43*/w/*19.44*/.lastName),format.raw/*19.53*/("""</td><td>"""),_display_(/*19.63*/w/*19.64*/.phone),format.raw/*19.70*/("""</td>
                <td><a href=""""),_display_(/*20.31*/routes/*20.37*/.UserController.edit(w.phone)),format.raw/*20.66*/("""">Edit</a></td >
                <td><a href=""""),_display_(/*21.31*/routes/*21.37*/.UserController.deleteUser(w.phone)),format.raw/*21.72*/("""">Delete</a></td></tr>
        """)))}),format.raw/*22.10*/("""
        """),format.raw/*23.9*/("""</tbody>
    </table>

    <hr/>

    """),format.raw/*28.66*/("""
    """),_display_(/*29.6*/if(form.hasGlobalErrors)/*29.30*/ {_display_(Seq[Any](format.raw/*29.32*/("""
        """),_display_(/*30.10*/form/*30.14*/.globalErrors.asScala.map/*30.39*/ { error: play.data.validation.ValidationError =>_display_(Seq[Any](format.raw/*30.88*/("""
            """),format.raw/*31.13*/("""<div>
                """),_display_(/*32.18*/error/*32.23*/.key),format.raw/*32.27*/(""": """),_display_(/*32.30*/error/*32.35*/.message),format.raw/*32.43*/("""
            """),format.raw/*33.13*/("""</div>
        """)))}),format.raw/*34.10*/("""
    """)))}),format.raw/*35.6*/("""

    """),_display_(/*37.6*/helper/*37.12*/.form(routes.UserController.createUser)/*37.51*/ {_display_(Seq[Any](format.raw/*37.53*/("""
        """),_display_(/*38.10*/helper/*38.16*/.CSRF.formField),format.raw/*38.31*/("""

        """),_display_(/*40.10*/helper/*40.16*/.inputText(form("firstName"))),format.raw/*40.45*/("""
        """),_display_(/*41.10*/helper/*41.16*/.inputText(form("lastName"))),format.raw/*41.44*/("""
        """),_display_(/*42.10*/helper/*42.16*/.inputText(form("phone"))),format.raw/*42.41*/("""
        """),_display_(/*43.10*/helper/*43.16*/.inputText(form("password"))),format.raw/*43.44*/("""

        """),format.raw/*45.9*/("""<button type="submit">Create New User</button>
    """)))}),format.raw/*46.6*/("""

""")))}),format.raw/*48.2*/("""
"""))
      }
    }
  }

  def render(users:Seq[User],form:Form[UserData],request:Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(users,form)(request,messages)

  def f:((Seq[User],Form[UserData]) => (Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (users,form) => (request,messages) => apply(users,form)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Jun 14 15:58:21 PDT 2019
                  SOURCE: C:/Users/Maoshun/Desktop/mydemo/app/views/listUsers.scala.html
                  HASH: aadc21709e06fc6833e4fde4ed39936924034b8d
                  MATRIX: 651->1|1033->31|1224->129|1251->131|1272->144|1311->146|1343->152|1390->207|1421->213|1436->220|1469->245|1530->269|1562->274|1602->287|1627->291|1657->294|1683->299|1725->311|1758->317|1940->472|1971->487|2011->489|2052->502|2088->511|2098->512|2129->522|2166->532|2176->533|2206->542|2243->552|2253->553|2280->559|2343->595|2358->601|2408->630|2482->677|2497->683|2553->718|2616->750|2652->759|2718->858|2750->864|2783->888|2823->890|2860->900|2873->904|2907->929|2994->978|3035->991|3085->1014|3099->1019|3124->1023|3154->1026|3168->1031|3197->1039|3238->1052|3285->1068|3321->1074|3354->1081|3369->1087|3417->1126|3457->1128|3494->1138|3509->1144|3545->1159|3583->1170|3598->1176|3648->1205|3685->1215|3700->1221|3749->1249|3786->1259|3801->1265|3847->1290|3884->1300|3899->1306|3948->1334|3985->1344|4067->1396|4100->1399
                  LINES: 24->1|29->2|34->3|35->4|35->4|35->4|37->6|39->8|40->9|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|42->11|44->13|49->18|49->18|49->18|50->19|50->19|50->19|50->19|50->19|50->19|50->19|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|54->23|59->28|60->29|60->29|60->29|61->30|61->30|61->30|61->30|62->31|63->32|63->32|63->32|63->32|63->32|63->32|64->33|65->34|66->35|68->37|68->37|68->37|68->37|69->38|69->38|69->38|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|74->43|76->45|77->46|79->48
                  -- GENERATED --
              */
          