package pkg.what.a_0.domain.core.constants

object ConstantsPQ {
    const val LOG_INFO_TAG = "Log Info"
    const val LOG_DEBUG_TAG = "Log Debug"
}

object FragLcTags {
    /** @NOTE Fragment lifecycle as of API 30 */
    const val LOG_ATTACH = "ON_ATTACH"
    const val LOG_CREATE_VIEW = "ON_CREATE_VIEW"
    const val LOG_VIEW_CREATED = "ON_VIEW_CREATED"
    const val LOG_VIEW_STATE_RESTORED = "ON_VIEW_STATE_RESTORED"
    const val LOG_START = "ON_START"
    const val LOG_RESUME = "ON_RESUME"
    const val LOG_PAUSE = "ON_PAUSE"
    const val LOG_STOP = "ON_STOP"
    const val LOG_SAVE_INSTANCE_STATE = "ON_SAVE_INSTANCE_STATE"
    const val LOG_DESTROY_VIEW = "ON_DESTROY_VIEW"
    const val LOG_DESTROY = "ON_DESTROY"
    const val LOG_DETACH = "ON_DETACH"
}

object NetDataTags {
    const val NET_DATA_IMG_TAG = "img"
    const val NET_DATA_ID_TAG = "id"
    const val NET_DATA_NAME_TAG = "name"
    const val NET_DATA_USERNAME_TAG = "username"
    const val NET_DATA_EMAIL_TAG = "email"
    const val NET_DATA_ADDRESS_TAG = "address"
    const val NET_DATA_PHONE_TAG = "phone"
    const val NET_DATA_WEBSITE_TAG = "website"
    const val NET_DATA_COMPANY_TAG = "company"
    const val NET_DATA_STREET_TAG = "street"
    const val NET_DATA_SUITE_TAG = "suite"
    const val NET_DATA_CITY_TAG = "city"
    const val NET_DATA_ZIPCODE_TAG = "zipcode"
    const val NET_DATA_GEO_TAG = "geo"
    const val NET_DATA_CATCHPHRASE_TAG = "catchPhrase"
    const val NET_DATA_BS_TAG = "bs"
    const val NET_DATA_LAT_TAG = "lat"
    const val NET_DATA_LNG_TAG = "lng"
}

object NetEptTags {
    const val BASE_ROBOHASH_ENDPOINT = "https://robohash.org/"
    const val BASE_TYPICODE_ENDPOINT = "http://jsonplaceholder.typicode.com/"
    const val USERS_PATH = "Users/"
    const val IMAGES_PATH = "qwerty/"
}

object NetConTags {
    const val LOG_CONNECT_FAILED = "Connection, Failure"
    const val LOG_CONNECT_SUCCESS = "Connection, Success"
    const val LOG_NET_FAILURE = "Network, Failure"
    const val LOG_NET_SUCCESS = "Network, Success"
}
