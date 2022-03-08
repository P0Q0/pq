package pkg.what.a_0.data.model

class LoginModel {

    /** @desc stores the credentials of a user during runtime, does not persist automatically
     * , for persistence cache the data on their device only if they gave permission */
    private var cache: ArrayList<String> = arrayListOf()

    init {
        this.cache.add("root")
    }
}