@file: JsModule("reactstrap")

package reactstrap.component

import org.w3c.dom.Node
import react.*

@JsName("Breadcrumb")
external class Breadcrumb : Component<Breadcrumb.Props, RState> {
    override fun render(): ReactElement?

    interface Props : RProps {
        var tag: Any?
        var listTag: Any?
        var className: String?
        var listClassName: String?
        var cssModule: Any?
        var children: Node?
        var ariaLabel: String?
    }
}