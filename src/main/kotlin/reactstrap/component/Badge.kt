@file: JsModule("reactstrap")


package reactstrap.component
import org.w3c.dom.Node
import react.*

@JsName("Badge")
external class Badge : Component<Badge.Props, RState> {
    override fun render(): ReactElement?

    interface Props : RProps {
        var color: String?
        var pill: Boolean?
        var tag: Any?
        var innerRef: Any?
        var children: Node?
        var className: String?
        var cssModule: Any?
    }
}