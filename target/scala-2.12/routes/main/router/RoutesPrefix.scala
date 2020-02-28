// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Maoshun/Desktop/mydemo/conf/routes
// @DATE:Wed Jun 26 06:05:27 PDT 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
