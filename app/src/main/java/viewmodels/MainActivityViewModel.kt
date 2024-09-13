package viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    private val _button1Checked = MutableLiveData(false )
    val button1Checked: LiveData<Boolean> = _button1Checked

    fun switchCheckBox() {
        if (_button1Checked.value == true) {
            _button1Checked.value = false
        } else {
            _button1Checked.value = true
        }
    }
}