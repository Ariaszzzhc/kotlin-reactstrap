package reactstrap.dsl

import org.w3c.dom.Node
import react.*
import reactstrap.component.Button

fun RBuilder.button(
    active: Boolean? = null,
    ariaLabel: String? = null,
    block: Boolean? = null,
    color: String? = "secondary",
    disabled: Boolean? = null,
    outline: Boolean? = null,
    tag: String? = "button",
    innerRef: String? = null,
    onClick: (() -> Unit)? = null,
    size: String? = null,
    children: Node? = null,
    className: String? = null,
    cssModule: Any? = null,
    close: Boolean? = null
) = child(Button::class) {
    attrs {
        this.active = active
        this.ariaLabel = ariaLabel
        this.block = block
        this.color = color
        this.disabled = disabled
        this.outline = outline
        this.tag = tag
        this.innerRef = innerRef
        this.onClick = onClick
        this.size = size
        this.children = children
        this.className = className
        this.cssModule = cssModule
        this.close = close
    }
}