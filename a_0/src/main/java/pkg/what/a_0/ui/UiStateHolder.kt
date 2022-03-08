package pkg.what.a_0.ui

import androidx.lifecycle.ViewModel
import pkg.what.a_0.domain.controller.ViewModelDisplay
import pkg.what.a_0.domain.controller.ViewModelLogin
import pkg.what.a_0.domain.controller.ViewModelPQ

/** @desc holds instance of view model that will expose data to the ui
 * , updates state managed through the callers lifecycle */
sealed class UiStateHolder {
    val vmPQ: ViewModelPQ by lazy { ViewModelPQ() }
    val vmLogin: ViewModelLogin by lazy { ViewModelLogin() }
    val vmDisplay: ViewModelDisplay by lazy { ViewModelDisplay() }
    data class ALIVE(val status: String) : UiStateHolder()
    data class DEAD(val status: String) : UiStateHolder()
    data class UNKNOWN(val status: String) : UiStateHolder()
    object UiShState : UiStateHolder() {
        fun update(type : Class<ViewModel>) {
            /** @TODO: UiStateHolder: update state here */
        }
    }
}