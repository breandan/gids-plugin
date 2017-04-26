package com.gids

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.ui.components.dialog
import com.intellij.ui.layout.panel
import javax.swing.JPasswordField
import javax.swing.JTextField

/**
 * Created by breandanconsidine on 4/26/17.
 */

class ShowBox : AnAction() {
    override fun actionPerformed(e: AnActionEvent?) {
        val usernameField = JTextField("Username: ")
        val passwordField = JPasswordField("Password: ")
        val popup = panel {
            noteRow("Hello GIDS! Please log in...")
            row("Username: ") { usernameField() }
            row("Username: ") { passwordField() }
        }

        dialog(title = "Hello GIDS Panel", panel = popup) {
            println("Username: ${usernameField.text}\nPassword: ${passwordField.text}")
        }.show()
    }

}