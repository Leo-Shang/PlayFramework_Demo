
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
  """),_display_(/*3.4*/main("Welcome to Play")/*3.27*/ {_display_(Seq[Any](format.raw/*3.29*/("""
    """),format.raw/*4.5*/("""<div>
      <ul>
        <li>Please go to <a href=""""),_display_(/*6.36*/routes/*6.42*/.UserController.listUsers),format.raw/*6.67*/("""">"""),_display_(/*6.70*/routes/*6.76*/.UserController.listUsers),format.raw/*6.101*/("""</a></li>
      </ul>

    </div>

  """)))}),format.raw/*11.4*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Jun 14 03:03:14 PDT 2019
                  SOURCE: C:/Users/Maoshun/Desktop/mydemo/app/views/index.scala.html
                  HASH: 42acbe75af9a05c4d117c8e0d16f0602bbe6a5c5
                  MATRIX: 941->1|1037->4|1066->8|1097->31|1136->33|1167->38|1245->90|1259->96|1304->121|1333->124|1347->130|1393->155|1461->193
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|37->6|37->6|37->6|37->6|37->6|37->6|42->11
                  -- GENERATED --
              */
          