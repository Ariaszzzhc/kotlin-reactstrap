package reactstrap.dsl

import org.w3c.dom.Node
import react.*
import reactstrap.component.*

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

fun RBuilder.badge(
    color: String? = "secondary",
    pill: Boolean? = false,
    tag: Any? = "span",
    innerRef: Any? = null,
    children: Node? = null,
    className: String? = null,
    cssModule: Any? = null
) = child(Badge::class) {
    attrs {
        this.color = color
        this.pill = pill
        this.tag = tag
        this.innerRef = innerRef
        this.children = children
        this.className = className
        this.cssModule = cssModule
    }
}

fun RBuilder.breadcrumb(
    tag: Any? = "nav",
    listTag: Any? = "ol",
    className: String? = null,
    listClassName: String? = null,
    cssModule: Any? = null,
    children: Node? = null,
    ariaLabel: String? = "breadcrumb"
) = child(Breadcrumb::class) {
    attrs {
        this.tag = tag
        this.listTag = listTag
        this.className = className
        this.listClassName = listClassName
        this.cssModule = cssModule
        this.children = children
        this.ariaLabel = ariaLabel
    }
}

fun RBuilder.breadcrumbItem(
    tag: Any? = "li",
    active: Boolean? = null,
    className: String? = null,
    cssModule: Any? = null
) = child(BreadcrumbItem::class) {
    attrs {
        this.tag = tag
        this.active = active
        this.className = className
        this.cssModule = cssModule
    }
}

fun RBuilder.buttonDropdown(
    children: Node? = null
) = child(ButtonDropdown::class) {
    attrs {
        this.children = null
    }
}

fun RBuilder.buttonGroup(
    tag: Any? = "div",
    ariaLabel: String? = null,
    cssModule: Any? = null,
    role: String? = "role",
    size: String? = null,
    vertical: Boolean? = null
) = child(ButtonGroup::class) {
    attrs {
        this.tag = tag
        this.ariaLabel = ariaLabel
        this.cssModule = cssModule
        this.role = role
        this.size = size
        this.vertical = vertical
    }
}