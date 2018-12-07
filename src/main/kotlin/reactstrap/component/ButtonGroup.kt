@file: JsModule("reactstrap")

package reactstrap.component

import react.*

@JsName("ButtonGroup")
external class ButtonGroup : Component<ButtonGroup.Props, RState> {
    override fun render(): ReactElement?

    interface Props: RProps {
        var tag: Any?
        var ariaLabel: String?
        var cssModule: Any?
        var role: String?
        var size: String?
        var vertical: Boolean?
    }
}

