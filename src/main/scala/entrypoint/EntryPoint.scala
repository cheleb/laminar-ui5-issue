package entrypoint

import be.doeraene.webcomponents.ui5.configkeys.InputType
import be.doeraene.webcomponents.ui5.*

import com.raquo.laminar.api.L.*
import org.scalajs.dom
import be.doeraene.webcomponents.ui5.configkeys.IconName
import be.doeraene.webcomponents.ui5.configkeys.ValueState

object EntryPoint {

  def main(args: Array[String]): Unit = {
    val app = div(
      SideNavigation(),
      UList(
        width := "100%",
        _.item(
          _.icon                := IconName.`nutrition-activity`,
          _.description         := "Tropical plant with an edible fruit",
          _.additionalText      := "In-stock",
          _.additionalTextState := ValueState.Success,
          "Pineapple"
        ),
        _.item(
          _.icon                := IconName.`nutrition-activity`,
          _.description         := "Occurs between red and yellow",
          _.additionalText      := "Expires",
          _.additionalTextState := ValueState.Warning,
          "Orange"
        ),
        _.item(
          _.icon                := IconName.`nutrition-activity`,
          _.description         := "The yellow lengthy fruit",
          _.additionalText      := "Re-stock",
          _.additionalTextState := ValueState.Information,
          "Blueberry"
        ),
        _.item(
          _.icon                := IconName.`nutrition-activity`,
          _.description         := "The tropical stone fruit",
          _.additionalText      := "Re-stock",
          _.additionalTextState := ValueState.Error,
          "Mango"
        )
      )
    )

    render(
      dom.document.getElementById("root"),
      app
    )

  }

}
