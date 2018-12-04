@file: JsModule("reactstrap")

package reactstrap.component

import org.w3c.dom.Node
import react.*

@JsName("Button")
external class Button : Component<Button.Props, RState> {
    override fun render(): ReactElement?

    interface Props : RProps {
        var active: Boolean?
        var ariaLabel: String?
        var block: Boolean?
        var color: String?
        var disabled: Boolean?
        var outline: Boolean?
        // tag: PropTypes.oneOfType([PropTypes.func, PropTypes.string])
        var tag: String?
        // PropTypes.oneOfType([PropTypes.object, PropTypes.func, PropTypes.string])
        var innerRef: String?
        var onClick: (() -> Unit)?
        var size: String?
        var children: Node?
        var className: String?
        var cssModule: Any?
        var close: Boolean?
    }
}