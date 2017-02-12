/*
 * NewsCatchr
 * Copyright © 2017 Jan-Lukas Else
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package jlelse.newscatchr.ui.layout

import android.support.v7.widget.LinearLayoutManager
import android.view.View
import jlelse.newscatchr.extensions.statefulRecyclerView
import jlelse.newscatchr.ui.fragments.BaseFragment
import jlelse.readit.R
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext

class BasicRecyclerUI : AnkoComponent<BaseFragment> {
	override fun createView(ui: AnkoContext<BaseFragment>): View = with(ui) {
		statefulRecyclerView {
			id = R.id.basicrecyclerview_recycler
			layoutManager = LinearLayoutManager(context)
		}
	}
}