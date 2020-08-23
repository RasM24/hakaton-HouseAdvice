package ru.endroad.feature.support

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.support_fragment.stub_text
import ru.endroad.houseadvice.feature.support.R

class SupportFragment : Fragment() {

	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View =
		inflater.inflate(R.layout.support_fragment, container, false)

	override fun onActivityCreated(savedInstanceState: Bundle?) {
		super.onActivityCreated(savedInstanceState)
		requireActivity().title = "Связь с ТСЖ/ЖКХ"

		stub_text.text = "Когда-нибудь здесь что-то будет"
	}
}