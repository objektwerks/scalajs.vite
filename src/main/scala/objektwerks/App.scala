package objektwerks

import org.scalajs.dom
import org.scalajs.dom.document
import org.scalajs.dom.HTMLDocument

object App:
  def main(args: Array[String]): Unit =
    document.addEventListener("DOMContentLoaded", { (_: dom.Event) =>
      build(document)
    })
    scribe.info("*** Scalajs console app!")

  def build(document: HTMLDocument): Unit =
    val paragraph = document.createElement("p")
    paragraph.id = "pid"
    paragraph.textContent = "Scalajs web app!"
    document.body.appendChild(paragraph)

    val button = document.createElement("button")
    button.id = "bid"
    button.textContent = "Print To Console"
    button.addEventListener("click", { (_: dom.MouseEvent) =>
      scribe.info("*** Button clicked!")
    })
    document.body.appendChild(button)
    ()