@file: JsModule("reactstrap")

package reactstrap.component

import react.*

@JsName("BreadcrumbItem")
external class BreadcrumbItem : Component<BreadcrumbItem.Props, RState> {
    override fun render(): ReactElement?

    interface Props : RProps {
        var tag: Any?
        var active: Boolean?
        var className: String?
        var cssModule: Any?
    }
}