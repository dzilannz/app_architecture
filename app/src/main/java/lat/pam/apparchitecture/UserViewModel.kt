package lat.pam.apparchitecture

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserViewModel : ViewModel() {
    private val _users = MutableLiveData<List<User>>()
    val users: LiveData<List<User>> = _users

    init {
        loadUsers()
    }

    private fun loadUsers() {
        val sampleUsers = listOf(
            User("John Doe"),
            User("Jane Smith"),
            User("Alice Johnson"),
            User("Bob Brown")
        )
        _users.value = sampleUsers
    }
}