
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

object edit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Form[UserData],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(phone: String, form: Form[UserData]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.39*/("""

"""),_display_(/*4.2*/helper/*4.8*/.form(routes.UserController.done(phone))/*4.48*/ {_display_(Seq[Any](format.raw/*4.50*/("""
    """),_display_(/*5.6*/helper/*5.12*/.CSRF.formField),format.raw/*5.27*/("""

    """),_display_(/*7.6*/helper/*7.12*/.inputText(form("firstName"))),format.raw/*7.41*/("""
    """),_display_(/*8.6*/helper/*8.12*/.inputText(form("lastName"))),format.raw/*8.40*/("""
    """),_display_(/*9.6*/helper/*9.12*/.inputText(form("phone"))),format.raw/*9.37*/("""
    """),_display_(/*10.6*/helper/*10.12*/.inputText(form("password"))),format.raw/*10.40*/("""

    """),format.raw/*12.5*/("""<button type="submit">Done</button>
""")))}))
      }
    }
  }

  def render(phone:String,form:Form[UserData]): play.twirl.api.HtmlFormat.Appendable = apply(phone,form)

  def f:((String,Form[UserData]) => play.twirl.api.HtmlFormat.Appendable) = (phone,form) => apply(phone,form)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Jun 14 03:36:39 PDT 2019
                  SOURCE: C:/Users/Maoshun/Desktop/mydemo/app/views/edit.scala.html
                  HASH: 2f90d3ed603caf10ad36e1f53edc12a22dec8344
                  MATRIX: 651->1|998->32|1130->69|1160->74|1173->80|1221->120|1260->122|1292->129|1306->135|1341->150|1375->159|1389->165|1438->194|1470->201|1484->207|1532->235|1564->242|1578->248|1623->273|1656->280|1671->286|1720->314|1755->322
                  LINES: 24->1|29->2|34->2|36->4|36->4|36->4|36->4|37->5|37->5|37->5|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|44->12
                  -- GENERATED --
              */
          