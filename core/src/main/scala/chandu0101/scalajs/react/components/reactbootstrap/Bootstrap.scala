package chandu0101.scalajs.react.components
package reactbootstrap

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

import scala.scalajs.js


/**
 * Created by chandrasekharkode on 11/29/14.
 *
 *  Its wrapper for reactbootstrap , you need js source file from
 *   Warning : its not currently supported
 *
 */


object ReactBootstrap extends js.Object {

  def Button: js.Dynamic = js.native

  def Accordion: js.Dynamic = js.native

  def Affix: js.Dynamic = js.native

  def Alert: js.Dynamic = js.native

  def Badge: js.Dynamic = js.native

  def ButtonGroup: js.Dynamic = js.native

  def ButtonToolbar: js.Dynamic = js.native

  def Carousel: js.Dynamic = js.native

  def Col: js.Dynamic = js.native

  def DropdownButton: js.Dynamic = js.native

  def DropdownMenu: js.Dynamic = js.native

  def Glyphicon: js.Dynamic = js.native

  def Grid: js.Dynamic = js.native

  def Input: js.Dynamic = js.native

  def Interpolate : js.Dynamic = js.native

  def Jumbotron : js.Dynamic = js.native

  def Label : js.Dynamic = js.native

  def ListGroup : js.Dynamic = js.native

  def ListGroupItem : js.Dynamic = js.native

  def MenuItem : js.Dynamic = js.native

  def Modal : js.Dynamic = js.native

  def ModalTrigger : js.Dynamic = js.native

  def Nav : js.Dynamic = js.native

  def NavItem : js.Dynamic = js.native

  def Navbar : js.Dynamic = js.native

  def OverlayTrigger : js.Dynamic = js.native

  def PageHeader : js.Dynamic = js.native

  def PageItem : js.Dynamic = js.native

  def Pager : js.Dynamic = js.native

  def Panel : js.Dynamic = js.native

  def PanelGroup : js.Dynamic = js.native

  def Popover : js.Dynamic = js.native

  def ProgressBar : js.Dynamic = js.native

  def Row : js.Dynamic = js.native

  def SplitButton : js.Dynamic = js.native

  def propTypes : js.Dynamic = js.native

  def SubNav : js.Dynamic = js.native

  def TabPane : js.Dynamic = js.native

  def TabbedArea : js.Dynamic = js.native

  def Table : js.Dynamic = js.native

  def Tooltip : js.Dynamic = js.native

  def Well : js.Dynamic = js.native


}


object bootStrap {

  case class Button(bsSize: U[String] = js.undefined,
                    onClick: U[js.Function0[Unit]] = js.undefined,
                    navDropdown: U[Boolean] = js.undefined,
                    block: U[Boolean] = js.undefined,
                    disabled: U[Boolean] = js.undefined,
                    bsStyle: U[String] = js.undefined,
                    componentClass: U[String] = js.undefined,
                    navItem: U[Boolean] = js.undefined,
                    bsClass: U[String] = js.undefined,
                    active: U[Boolean] = js.undefined,
                    hrefB: U[String] = js.undefined) {
    def toJs: js.Any = {
      val p = new TypedJsProps
      active.foreach(p.setV("active"))
      hrefB.foreach(p.setV("href"))
      navItem.foreach(p.setV("navItem"))
      bsSize.foreach(p.setV("bsSize"))
      navDropdown.foreach(p.setV("navDropdown"))
      bsStyle.foreach(p.setV("bsStyle"))
      disabled.foreach(p.setV("disabled"))
      block.foreach(p.setV("block"))
      onClick.foreach(p.setV("block"))
      bsClass.foreach(p.setV("bsClass"))
      componentClass.foreach(p.setV("componentClass"))
      p
    }

    def apply(children: TagMod*): ReactComponentU_ = {
      val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.Button)
      f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
    }
  }

  case class Accordion() {
    def toJs: js.Any = {
      val p = new TypedJsProps
      p
    }

    def apply(): ReactComponentU_ = {
      val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.Accordion)
      f(toJs).asInstanceOf[ReactComponentU_]
    }
  }

  case class Affix(offset: U[Double] = js.undefined, offsetTop: U[Double] = js.undefined, offsetBottom: U[Double] = js.undefined) {
    def toJs: js.Any = {
      val p = new TypedJsProps
      offset.foreach(p.setV("offset"))
      offsetTop.foreach(p.setV("offsetTop"))
      offsetBottom.foreach(p.setV("offsetBottom"))
      p
    }

    def apply(children: TagMod*): ReactComponentU_ = {
      val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.Affix)
      f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
    }
  }

  //TODO  onDismiss: React.PropTypes.func,
  case class Alert(bsClass: U[String] = js.undefined, bsStyle: U[String] = js.undefined, bsSize: U[String] = js.undefined, dismissAfter: U[Double] = js.undefined) {
    def toJs: js.Any = {
      val p = new TypedJsProps
      bsClass.foreach(p.setV("bsClass"))
      bsStyle.foreach(p.setV("bsStyle"))
      bsSize.foreach(p.setV("bsSize"))
      dismissAfter.foreach(p.setV("dismissAfter"))
      p
    }

    def apply(children: TagMod*): ReactComponentU_ = {
      val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.Alert)
      f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
    }
  }

  case class Badge(pullRight: U[Boolean] = js.undefined) {
    def toJs: js.Any = {
      val p = new TypedJsProps
      pullRight.foreach(p.setV("pullRight"))
      p
    }

    def apply(children: TagMod*): ReactComponentU_ = {
      val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.Badge)
      f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
    }
  }

  case class ButtonGroup(justified: U[Boolean] = js.undefined, bsSize: U[String] = js.undefined, vertical: U[Boolean] = js.undefined, bsStyle: U[String] = js.undefined, bsClass: U[String] = js.undefined) {
    def toJs: js.Any = {
      val p = new TypedJsProps
      justified.foreach(p.setV("justified"))
      bsSize.foreach(p.setV("bsSize"))
      vertical.foreach(p.setV("vertical"))
      bsStyle.foreach(p.setV("bsStyle"))
      bsClass.foreach(p.setV("bsClass"))
      p
    }

    def apply(children: TagMod*): ReactComponentU_ = {
      val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.ButtonGroup)
      f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
    }
  }


  case class ButtonToolbar(bsClass: U[String] = js.undefined, bsStyle: U[String] = js.undefined, bsSize: U[String] = js.undefined) {
    def toJs: js.Any = {
      val p = new TypedJsProps
      bsClass.foreach(p.setV("bsClass"))
      bsStyle.foreach(p.setV("bsStyle"))
      bsSize.foreach(p.setV("bsSize"))
      p
    }

    def apply(children: TagMod*): ReactComponentU_ = {
      val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.ButtonToolbar)
      f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
    }
  }


  //TODO   onSelect: React.PropTypes.func,
  // onSlideEnd: React.PropTypes.func,
  case class Carousel(bsSize: U[String] = js.undefined, defaultActiveIndex: U[Double] = js.undefined, onSlideEnd: U[js.Any] = js.undefined, direction: U[String] = js.undefined, wrap: U[Boolean] = js.undefined, slide: U[Boolean] = js.undefined, indicators: U[Boolean] = js.undefined, activeIndex: U[Double] = js.undefined, pauseOnHover: U[Boolean] = js.undefined, onSelect: U[js.Any] = js.undefined, bsStyle: U[String] = js.undefined, bsClass: U[String] = js.undefined, controls: U[Boolean] = js.undefined) {
    def toJs: js.Any = {
      val p = new TypedJsProps
      controls.foreach(p.setV("controls"))
      onSelect.foreach(p.setV("onSelect"))
      indicators.foreach(p.setV("indicators"))
      bsSize.foreach(p.setV("bsSize"))
      defaultActiveIndex.foreach(p.setV("defaultActiveIndex"))
      activeIndex.foreach(p.setV("activeIndex"))
      bsStyle.foreach(p.setV("bsStyle"))
      slide.foreach(p.setV("slide"))
      pauseOnHover.foreach(p.setV("pauseOnHover"))
      bsClass.foreach(p.setV("bsClass"))
      direction.foreach(p.setV("direction"))
      wrap.foreach(p.setV("wrap"))
      onSlideEnd.foreach(p.setV("onSlideEnd"))
      p
    }

    def apply(children: TagMod*): ReactComponentU_ = {
      val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.Carousel)
      f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
    }
  }


  case class Col(xs: U[Double] = js.undefined, lgPush: U[Double] = js.undefined, xsOffset: U[Double] = js.undefined, smPush: U[Double] = js.undefined, xsPull: U[Double] = js.undefined, xsPush: U[Double] = js.undefined, smOffset: U[Double] = js.undefined, lg: U[Double] = js.undefined, sm: U[Double] = js.undefined, lgPull: U[Double] = js.undefined, mdOffset: U[Double] = js.undefined, componentClass: U[String], mdPush: U[Double] = js.undefined, md: U[Double] = js.undefined, lgOffset: U[Double] = js.undefined, smPull: U[Double] = js.undefined, mdPull: U[Double] = js.undefined) {
    def toJs: js.Any = {
      val p = new TypedJsProps
      lgPush.foreach(p.setV("lgPush"))
      lg.foreach(p.setV("lg"))
      mdOffset.foreach(p.setV("mdOffset"))
      mdPush.foreach(p.setV("mdPush"))
      sm.foreach(p.setV("sm"))
      lgPull.foreach(p.setV("lgPull"))
      xsOffset.foreach(p.setV("xsOffset"))
      smPull.foreach(p.setV("smPull"))
      lgOffset.foreach(p.setV("lgOffset"))
      xsPush.foreach(p.setV("xsPush"))
      md.foreach(p.setV("md"))
      smOffset.foreach(p.setV("smOffset"))
      mdPull.foreach(p.setV("mdPull"))
      smPush.foreach(p.setV("smPush"))
      componentClass.foreach(p.setV("componentClass"))
      xs.foreach(p.setV("xs"))
      xsPull.foreach(p.setV("xsPull"))
      p
    }

    def apply(children: TagMod*): ReactComponentU_ = {
      val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.Col)
      f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
    }
  }

  // TODO  onClick:   React.PropTypes.func,
  //  onSelect:  React.PropTypes.func,
  case class DropdownButton(bsSize: U[String] = js.undefined, onClick: U[js.Any] = js.undefined, dropup: U[Boolean] = js.undefined, onSelect: U[js.Any] = js.undefined, bsStyle: U[String] = js.undefined, title: U[String] = js.undefined, href: U[String] = js.undefined, navItem: U[Boolean] = js.undefined, pullRight: U[Boolean] = js.undefined, bsClass: U[String] = js.undefined) {
    def toJs: js.Any = {
      val p = new TypedJsProps
      onSelect.foreach(p.setV("onSelect"))
      navItem.foreach(p.setV("navItem"))
      pullRight.foreach(p.setV("pullRight"))
      onClick.foreach(p.setV("onClick"))
      bsSize.foreach(p.setV("bsSize"))
      bsStyle.foreach(p.setV("bsStyle"))
      href.foreach(p.setV("href"))
      title.foreach(p.setV("title"))
      dropup.foreach(p.setV("dropup"))
      bsClass.foreach(p.setV("bsClass"))
      p
    }

    def apply(children: TagMod*): ReactComponentU_ = {
      val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.DropdownButton)
      f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
    }
  }

  //TODO   onSelect: React.PropTypes.func
  case class DropdownMenu(pullRight: U[Boolean] = js.undefined, onSelect: U[js.Any] = js.undefined) {
    def toJs: js.Any = {
      val p = new TypedJsProps
      pullRight.foreach(p.setV("pullRight"))
      onSelect.foreach(p.setV("onSelect"))
      p
    }

    def apply(children: TagMod*): ReactComponentU_ = {
      val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.DropdownMenu)
      f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
    }
  }

  case class Glyphicon(glyph: U[String]) {
    def toJs: js.Any = {
      val p = new TypedJsProps
      glyph.foreach(p.setV("glyph"))
      p
    }

    def apply(children: TagMod*): ReactComponentU_ = {
      val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.Glyphicon)
      f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
    }
  }

  //TODO     componentClass: React.PropTypes.node.isRequired

  case class Grid(fluid: U[Boolean] = js.undefined, componentClass: U[String]) {
    def toJs: js.Any = {
      val p = new TypedJsProps
      fluid.foreach(p.setV("fluid"))
      componentClass.foreach(p.setV("componentClass"))
      p
    }

    def apply(children: TagMod*): ReactComponentU_ = {
      val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.Grid)
      f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
    }
  }


  case class input(groupClassName: U[String] = js.undefined, wrapperClassName: U[String] = js.undefined, labelB: U[String] = js.undefined, labelClassName: U[String] = js.undefined, addonBefore: U[String] = js.undefined, buttonAfter: U[String] = js.undefined, help: U[String] = js.undefined, buttonBefore: U[String] = js.undefined, hasFeedback: U[Boolean] = js.undefined, addonAfter: U[String] = js.undefined, disabledB: U[Boolean] = js.undefined, bsStyle: U[String] = js.undefined, typeB: U[String] = js.undefined) {
    def toJs: js.Any = {
      val p = new TypedJsProps
      labelB.foreach(p.setV("label"))
      buttonBefore.foreach(p.setV("buttonBefore"))
      groupClassName.foreach(p.setV("groupClassName"))
      help.foreach(p.setV("help"))
      wrapperClassName.foreach(p.setV("wrapperClassName"))
      hasFeedback.foreach(p.setV("hasFeedback"))
      buttonAfter.foreach(p.setV("buttonAfter"))
      bsStyle.foreach(p.setV("bsStyle"))
      addonAfter.foreach(p.setV("addonAfter"))
      disabledB.foreach(p.setV("disabled"))
      typeB.foreach(p.setV("type"))
      addonBefore.foreach(p.setV("addonBefore"))
      labelClassName.foreach(p.setV("labelClassName"))
      p
    }

    def apply(children: TagMod*): ReactComponentU_ = {
      val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.Input)
      f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
    }
  }

  case class Interpolate(format : U[String] = js.undefined) {
    def toJs: js.Any = {
      val p = new TypedJsProps
      format.foreach(p.setV("format"))
      p
    }

    def apply(children: TagMod*): ReactComponentU_ = {
      val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.Interpolate)
      f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
    }
  }

  case class Jumbotron() {
    def toJs: js.Any = {
      val p = new TypedJsProps
      p
    }

    def apply(children: TagMod*): ReactComponentU_ = {
      val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.Jumbotron)
      f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
    }
  }

  case class label(bsClass : U[String] = js.undefined,bsStyle : U[String] = js.undefined,bsSize : U[String] = js.undefined) {
    def toJs: js.Any = {
      val p = new TypedJsProps
      bsClass.foreach(p.setV("bsClass"))
      bsStyle.foreach(p.setV("bsStyle"))
      bsSize.foreach(p.setV("bsSize"))
      p
    }

    def apply(children: TagMod*): ReactComponentU_ = {
      val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.Label)
      f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
    }
  }

  //TODO onClick: React.PropTypes.func
  case class ListGroup(onClick : U[js.Any] = js.undefined) {
    def toJs: js.Any = {
      val p = new TypedJsProps
      onClick.foreach(p.setV("onClick"))
      p
    }

    def apply(children: TagMod*): ReactComponentU_ = {
      val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.ListGroup)
      f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
    }
  }



  case class ListGroupItem(bsSize : U[String] = js.undefined,onClick : U[js.Any] = js.undefined,header : U[String] = js.undefined,disabled : U[js.Any] = js.undefined,bsStyle : U[String] = js.undefined,eventKey : U[js.Any] = js.undefined,bsClass : U[String] = js.undefined,active : U[js.Any] = js.undefined) {
    def toJs: js.Any = {
      val p = new TypedJsProps
      active.foreach(p.setV("active"))
      eventKey.foreach(p.setV("eventKey"))
      onClick.foreach(p.setV("onClick"))
      bsSize.foreach(p.setV("bsSize"))
      bsStyle.foreach(p.setV("bsStyle"))
      disabled.foreach(p.setV("disabled"))
      bsClass.foreach(p.setV("bsClass"))
      header.foreach(p.setV("header"))
      p
    }

    def apply(children: TagMod*): ReactComponentU_ = {
      val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.ListGroupItem)
      f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
    }
  }

  case class MenuItem(divider : U[Boolean] = js.undefined,
                      header : U[Boolean] = js.undefined,onSelect : U[js.Any] = js.undefined,title : U[String] = js.undefined,href : U[String] = js.undefined,eventKey : U[String]=js.undefined) {
    def toJs: js.Any = {
      val p = new TypedJsProps
      onSelect.foreach(p.setV("onSelect"))
      divider.foreach(p.setV("divider"))
      eventKey.foreach(p.setV("eventKey"))
      href.foreach(p.setV("href"))
      title.foreach(p.setV("title"))
      header.foreach(p.setV("header"))
      p
    }

    def apply(children: TagMod*): ReactComponentU_ = {
      val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.MenuItem)
      f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
    }
  }

  case class Modal(backdrop : U[String] = js.undefined,onRequestHide : U[js.Any],keyboard : U[Boolean] = js.undefined,bsSize : U[String] = js.undefined,closeButton : U[Boolean] = js.undefined,animation : U[Boolean] = js.undefined,bsStyle : U[String] = js.undefined,title : U[String] = js.undefined,bsClass : U[String] = js.undefined) {
    def toJs: js.Any = {
      val p = new TypedJsProps
      bsSize.foreach(p.setV("bsSize"))
      keyboard.foreach(p.setV("keyboard"))
      bsStyle.foreach(p.setV("bsStyle"))
      title.foreach(p.setV("title"))
      bsClass.foreach(p.setV("bsClass"))
      backdrop.foreach(p.setV("backdrop"))
      animation.foreach(p.setV("animation"))
      onRequestHide.foreach(p.setV("onRequestHide"))
      closeButton.foreach(p.setV("closeButton"))
      p
    }

    def apply(children: TagMod*): ReactComponentU_ = {
      val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.Modal)
      f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
    }
  }


  case class ModalTrigger(modal : U[String]) {
    def toJs: js.Any = {
      val p = new TypedJsProps
      modal.foreach(p.setV("modal"))
      p
    }

    def apply(children: TagMod*): ReactComponentU_ = {
      val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.ModalTrigger)
      f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
    }
  }

  case class Nav(stacked : U[Boolean] = js.undefined,navbar : U[Boolean] = js.undefined,justified : U[Boolean] = js.undefined,defaultExpanded : U[Boolean] = js.undefined,expanded : U[Boolean] = js.undefined,collapsable : U[Boolean] = js.undefined,onSelect : U[js.Any] = js.undefined,bsStyle : U[String] = js.undefined,eventKey : U[js.Any]=js.undefined,right : U[Boolean] = js.undefined) {
    def toJs: js.Any = {
      val p = new TypedJsProps
      onSelect.foreach(p.setV("onSelect"))
      navbar.foreach(p.setV("navbar"))
      collapsable.foreach(p.setV("collapsable"))
      right.foreach(p.setV("right"))
      stacked.foreach(p.setV("stacked"))
      expanded.foreach(p.setV("expanded"))
      eventKey.foreach(p.setV("eventKey"))
      justified.foreach(p.setV("justified"))
      bsStyle.foreach(p.setV("bsStyle"))
      defaultExpanded.foreach(p.setV("defaultExpanded"))
      p
    }

    def apply(children: TagMod*): ReactComponentU_ = {
      val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.Nav)
      f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
    }
  }

  case class NavItem(bsSize : U[String] = js.undefined,disabled : U[Boolean] = js.undefined,onSelect : U[js.Any] = js.undefined,bsStyle : U[String] = js.undefined,title : U[String] = js.undefined,href : U[String] = js.undefined,eventKey : U[js.Any]=js.undefined,bsClass : U[String] = js.undefined,active : U[Boolean] = js.undefined) {
    def toJs: js.Any = {
      val p = new TypedJsProps
      active.foreach(p.setV("active"))
      onSelect.foreach(p.setV("onSelect"))
      eventKey.foreach(p.setV("eventKey"))
      bsSize.foreach(p.setV("bsSize"))
      bsStyle.foreach(p.setV("bsStyle"))
      disabled.foreach(p.setV("disabled"))
      href.foreach(p.setV("href"))
      title.foreach(p.setV("title"))
      bsClass.foreach(p.setV("bsClass"))
      p
    }

    def apply(children: TagMod*): ReactComponentU_ = {
      val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.NavItem)
      f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
    }
  }

  case class Navbar(onToggle : U[js.Any] = js.undefined,toggleButton : U[String] = js.undefined,bsSize : U[String] = js.undefined,fluid : U[Boolean] = js.undefined,role : U[String] = js.undefined,fixedTop : U[Boolean] = js.undefined,staticTop : U[Boolean] = js.undefined,navExpanded : U[Boolean] = js.undefined,brand : U[String] = js.undefined,inverse : U[Boolean] = js.undefined,fixedBottom : U[Boolean] = js.undefined,defaultNavExpanded : U[Boolean] = js.undefined,bsStyle : U[String] = js.undefined,componentClass : U[String],bsClass : U[String] = js.undefined) {
    def toJs: js.Any = {
      val p = new TypedJsProps
      defaultNavExpanded.foreach(p.setV("defaultNavExpanded"))
      navExpanded.foreach(p.setV("navExpanded"))
      inverse.foreach(p.setV("inverse"))
      onToggle.foreach(p.setV("onToggle"))
      staticTop.foreach(p.setV("staticTop"))
      bsSize.foreach(p.setV("bsSize"))
      bsStyle.foreach(p.setV("bsStyle"))
      fixedBottom.foreach(p.setV("fixedBottom"))
      fixedTop.foreach(p.setV("fixedTop"))
      bsClass.foreach(p.setV("bsClass"))
      componentClass.foreach(p.setV("componentClass"))
      role.foreach(p.setV("role"))
      toggleButton.foreach(p.setV("toggleButton"))
      fluid.foreach(p.setV("fluid"))
      brand.foreach(p.setV("brand"))
      p
    }

    def apply(children: TagMod*): ReactComponentU_ = {
      val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.Navbar)
      f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
    }
  }


  case class OverlayTrigger(delay : U[Double] = js.undefined,overlay : U[ReactComponentU_],delayShow : U[Double] = js.undefined,delayHide : U[Double] = js.undefined,placement : U[String] = js.undefined,defaultOverlayShown : U[Boolean] = js.undefined,trigger : U[String] = js.undefined) {
    def toJs: js.Any = {
      val p = new TypedJsProps
      delayShow.foreach(p.setV("delayShow"))
      placement.foreach(p.setV("placement"))
      delayHide.foreach(p.setV("delayHide"))
      trigger.foreach(p.setV("trigger"))
      overlay.foreach(p.setV("overlay"))
      defaultOverlayShown.foreach(p.setV("defaultOverlayShown"))
      delay.foreach(p.setV("delay"))
      p
    }

    def apply(children: TagMod*): ReactComponentU_ = {
      val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.OverlayTrigger)
      f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
    }
  }

  case class PageHeader() {
    def toJs: js.Any = {
      val p = new TypedJsProps

      p
    }

    def apply(children: TagMod*): ReactComponentU_ = {
      val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.PageHeader)
      f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
    }
  }

  case class PageItem(previous : U[Boolean] = js.undefined,next : U[Boolean] = js.undefined,disabled : U[Boolean] = js.undefined,onSelect : U[js.Any] = js.undefined,eventKey : U[js.Any]=js.undefined) {
    def toJs: js.Any = {
      val p = new TypedJsProps
      onSelect.foreach(p.setV("onSelect"))
      eventKey.foreach(p.setV("eventKey"))
      next.foreach(p.setV("next"))
      disabled.foreach(p.setV("disabled"))
      previous.foreach(p.setV("previous"))
      p
    }

    def apply(children: TagMod*): ReactComponentU_ = {
      val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.PageItem)
      f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
    }
  }

  case class Pager(onSelect : U[js.Any] = js.undefined) {
    def toJs: js.Any = {
      val p = new TypedJsProps
      onSelect.foreach(p.setV("onSelect"))
      p
    }

    def apply(children: TagMod*): ReactComponentU_ = {
      val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.Pager)
      f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
    }
  }


  case class Panel(bsSize : U[String] = js.undefined,defaultExpanded : U[Boolean] = js.undefined,
                   expanded : U[Boolean] = js.undefined,collapsable : U[Boolean] = js.undefined,
                   header : U[String] = js.undefined,onSelect : U[js.Any] = js.undefined,bsStyle : U[String] = js.undefined,eventKey : U[js.Any]=js.undefined,footer : U[String] = js.undefined,bsClass : U[String] = js.undefined) {
    def toJs: js.Any = {
      val p = new TypedJsProps
      onSelect.foreach(p.setV("onSelect"))
      collapsable.foreach(p.setV("collapsable"))
      expanded.foreach(p.setV("expanded"))
      eventKey.foreach(p.setV("eventKey"))
      bsSize.foreach(p.setV("bsSize"))
      footer.foreach(p.setV("footer"))
      bsStyle.foreach(p.setV("bsStyle"))
      bsClass.foreach(p.setV("bsClass"))
      header.foreach(p.setV("header"))
      defaultExpanded.foreach(p.setV("defaultExpanded"))
      p
    }

    def apply(children: TagMod*): ReactComponentU_ = {
      val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.Panel)
      f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
    }
  }


  case class PanelGroup(activeKey : U[js.Any]=js.undefined,bsSize : U[String] = js.undefined,collapsable : U[Boolean] = js.undefined,defaultActiveKey : U[js.Any]=js.undefined,onSelect : U[js.Any] = js.undefined,bsStyle : U[String] = js.undefined,bsClass : U[String] = js.undefined) {
    def toJs: js.Any = {
      val p = new TypedJsProps
      activeKey.foreach(p.setV("activeKey"))
      defaultActiveKey.foreach(p.setV("defaultActiveKey"))
      onSelect.foreach(p.setV("onSelect"))
      collapsable.foreach(p.setV("collapsable"))
      bsSize.foreach(p.setV("bsSize"))
      bsStyle.foreach(p.setV("bsStyle"))
      bsClass.foreach(p.setV("bsClass"))
      p
    }

    def apply(children: TagMod*): ReactComponentU_ = {
      val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.PanelGroup)
      f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
    }
  }

  case class Popover(bsSize : U[String] = js.undefined,positionLeft : U[Double] = js.undefined,positionTop : U[Double] = js.undefined,arrowOffsetLeft : U[Double] = js.undefined,placement : U[String] = js.undefined,bsStyle : U[String] = js.undefined,title : U[String] = js.undefined,bsClass : U[String] = js.undefined,arrowOffsetTop : U[Double] = js.undefined) {
    def toJs: js.Any = {
      val p = new TypedJsProps
      arrowOffsetLeft.foreach(p.setV("arrowOffsetLeft"))
      placement.foreach(p.setV("placement"))
      positionTop.foreach(p.setV("positionTop"))
      positionLeft.foreach(p.setV("positionLeft"))
      bsSize.foreach(p.setV("bsSize"))
      bsStyle.foreach(p.setV("bsStyle"))
      title.foreach(p.setV("title"))
      bsClass.foreach(p.setV("bsClass"))
      arrowOffsetTop.foreach(p.setV("arrowOffsetTop"))
      p
    }

    def apply(children: TagMod*): ReactComponentU_ = {
      val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.Popover)
      f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
    }
  }

  case class ProgressBar(label : U[String] = js.undefined,
                         bsStyle : U[String] = js.undefined,
                         key : U[Int] = js.undefined,
                         striped : U[Boolean] = js.undefined,min : U[Double] = js.undefined,now : U[Double] = js.undefined,max : U[Double] = js.undefined,srOnly : U[Boolean] = js.undefined,active : U[Boolean] = js.undefined) {
    def toJs: js.Any = {
      val p = new TypedJsProps
      label.foreach(p.setV("label"))
      bsStyle.foreach(p.setV("bsStyle"))
      key.foreach(p.setV("key"))
      active.foreach(p.setV("active"))
      max.foreach(p.setV("max"))
      striped.foreach(p.setV("striped"))
      now.foreach(p.setV("now"))
      srOnly.foreach(p.setV("srOnly"))
      min.foreach(p.setV("min"))
      p
    }

    def apply(children: TagMod*): ReactComponentU_ = {
      val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.ProgressBar)
      f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
    }
  }


  case class Row(componentClass : U[String]) {
    def toJs: js.Any = {
      val p = new TypedJsProps
      componentClass.foreach(p.setV("componentClass"))
      p
    }

    def apply(children: TagMod*): ReactComponentU_ = {
      val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.Row)
      f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
    }
  }

  case class SplitButton(bsSize : U[String] = js.undefined,onClick : U[js.Any] = js.undefined,dropdownTitle : U[String] = js.undefined,disabled : U[Boolean] = js.undefined,onSelect : U[js.Any] = js.undefined,bsStyle : U[String] = js.undefined,title : U[String] = js.undefined,href : U[String] = js.undefined,pullRight : U[Boolean] = js.undefined,bsClass : U[String] = js.undefined) {
    def toJs: js.Any = {
      val p = new TypedJsProps
      onSelect.foreach(p.setV("onSelect"))
      dropdownTitle.foreach(p.setV("dropdownTitle"))
      pullRight.foreach(p.setV("pullRight"))
      onClick.foreach(p.setV("onClick"))
      bsSize.foreach(p.setV("bsSize"))
      bsStyle.foreach(p.setV("bsStyle"))
      disabled.foreach(p.setV("disabled"))
      href.foreach(p.setV("href"))
      title.foreach(p.setV("title"))
      bsClass.foreach(p.setV("bsClass"))
      p
    }

    def apply(children: TagMod*): ReactComponentU_ = {
      val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.SplitButton)
      f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
    }
  }


  case class propTypes(bsSize : U[String] = js.undefined,text : U[String] = js.undefined,disabled : U[Boolean] = js.undefined,onSelect : U[js.Any] = js.undefined,bsStyle : U[String] = js.undefined,title : U[String] = js.undefined,href : U[String] = js.undefined,bsClass : U[String] = js.undefined,active : U[Boolean] = js.undefined) {
    def toJs: js.Any = {
      val p = new TypedJsProps
      active.foreach(p.setV("active"))
      text.foreach(p.setV("text"))
      onSelect.foreach(p.setV("onSelect"))
      bsSize.foreach(p.setV("bsSize"))
      bsStyle.foreach(p.setV("bsStyle"))
      disabled.foreach(p.setV("disabled"))
      href.foreach(p.setV("href"))
      title.foreach(p.setV("title"))
      bsClass.foreach(p.setV("bsClass"))
      p
    }

    def apply(children: TagMod*): ReactComponentU_ = {
      val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.propTypes)
      f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
    }
  }

  case class SubNav(bsSize : U[String] = js.undefined,text : U[String] = js.undefined,disabled : U[Boolean] = js.undefined,onSelect : U[js.Any] = js.undefined,bsStyle : U[String] = js.undefined,title : U[String] = js.undefined,href : U[String] = js.undefined,bsClass : U[String] = js.undefined,active : U[Boolean] = js.undefined) {
    def toJs: js.Any = {
      val p = new TypedJsProps
      active.foreach(p.setV("active"))
      text.foreach(p.setV("text"))
      onSelect.foreach(p.setV("onSelect"))
      bsSize.foreach(p.setV("bsSize"))
      bsStyle.foreach(p.setV("bsStyle"))
      disabled.foreach(p.setV("disabled"))
      href.foreach(p.setV("href"))
      title.foreach(p.setV("title"))
      bsClass.foreach(p.setV("bsClass"))
      p
    }

    def apply(children: TagMod*): ReactComponentU_ = {
      val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.SubNav)
      f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
    }
  }

  case class TabPane() {
    def toJs: js.Any = {
      val p = new TypedJsProps

      p
    }

    def apply(children: TagMod*): ReactComponentU_ = {
      val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.TabPane)
      f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
    }
  }


  case class TabbedArea(bsSize : U[String] = js.undefined,animation : U[Boolean] = js.undefined,onSelect : U[js.Any] = js.undefined,bsStyle : U[String] = js.undefined,bsClass : U[String] = js.undefined) {
    def toJs: js.Any = {
      val p = new TypedJsProps
      onSelect.foreach(p.setV("onSelect"))
      bsSize.foreach(p.setV("bsSize"))
      bsStyle.foreach(p.setV("bsStyle"))
      bsClass.foreach(p.setV("bsClass"))
      animation.foreach(p.setV("animation"))
      p
    }

    def apply(children: TagMod*): ReactComponentU_ = {
      val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.TabbedArea)
      f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
    }
  }

  case class table(bordered : U[Boolean] = js.undefined,hover : U[Boolean] = js.undefined,striped : U[Boolean] = js.undefined,condensed : U[Boolean] = js.undefined,responsive : U[Boolean] = js.undefined) {
    def toJs: js.Any = {
      val p = new TypedJsProps
      bordered.foreach(p.setV("bordered"))
      striped.foreach(p.setV("striped"))
      condensed.foreach(p.setV("condensed"))
      responsive.foreach(p.setV("responsive"))
      hover.foreach(p.setV("hover"))
      p
    }

    def apply(children: TagMod*): ReactComponentU_ = {
      val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.Table)
      f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
    }
  }

  case class Tooltip(bsSize : U[String] = js.undefined,positionLeft : U[Double] = js.undefined,positionTop : U[Double] = js.undefined,arrowOffsetLeft : U[Double] = js.undefined,placement : U[String] = js.undefined,bsStyle : U[String] = js.undefined,bsClass : U[String] = js.undefined,arrowOffsetTop : U[Double] = js.undefined) {
    def toJs: js.Any = {
      val p = new TypedJsProps
      arrowOffsetLeft.foreach(p.setV("arrowOffsetLeft"))
      placement.foreach(p.setV("placement"))
      positionTop.foreach(p.setV("positionTop"))
      positionLeft.foreach(p.setV("positionLeft"))
      bsSize.foreach(p.setV("bsSize"))
      bsStyle.foreach(p.setV("bsStyle"))
      bsClass.foreach(p.setV("bsClass"))
      arrowOffsetTop.foreach(p.setV("arrowOffsetTop"))
      p
    }

    def apply(children: TagMod*): ReactComponentU_ = {
      val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.Tooltip)
      f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
    }
  }

  case class Well(bsClass : U[String] = js.undefined,bsStyle : U[String] = js.undefined,bsSize : U[String] = js.undefined) {
    def toJs: js.Any = {
      val p = new TypedJsProps
      bsClass.foreach(p.setV("bsClass"))
      bsStyle.foreach(p.setV("bsStyle"))
      bsSize.foreach(p.setV("bsSize"))
      p
    }

    def apply(children: TagMod*): ReactComponentU_ = {
      val f = React.asInstanceOf[js.Dynamic].createFactory(ReactBootstrap.Well)
      f(toJs, js.Array(children: _*)).asInstanceOf[ReactComponentU_]
    }
  }



}
