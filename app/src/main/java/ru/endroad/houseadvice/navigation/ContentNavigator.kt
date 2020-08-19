package ru.endroad.houseadvice.navigation

import androidx.annotation.IdRes
import androidx.fragment.app.FragmentManager

class ContentNavigator(@IdRes override val container: Int) : NavigatorHolder {
	override var fragmentManager: FragmentManager? = null
}