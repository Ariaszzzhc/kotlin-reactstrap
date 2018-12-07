@file: JsModule("reactstrap")

package reactstrap.component

import org.w3c.dom.Node
import react.*

@JsName("ButtonDropdown")
external class ButtonDropdown : Component<ButtonDropdown.Props, RState> {
    override fun render(): ReactElement?

    interface Props : RProps {
        var children: Node?
    }
}
