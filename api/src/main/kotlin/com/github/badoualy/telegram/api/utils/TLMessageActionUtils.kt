package com.github.badoualy.telegram.api.utils

import com.github.badoualy.telegram.tl.api.TLAbsMessageAction
import com.github.badoualy.telegram.tl.api.TLMessageActionChannelCreate
import com.github.badoualy.telegram.tl.api.TLMessageActionChannelMigrateFrom
import com.github.badoualy.telegram.tl.api.TLMessageActionChatAddUser
import com.github.badoualy.telegram.tl.api.TLMessageActionChatCreate
import com.github.badoualy.telegram.tl.api.TLMessageActionChatDeleteUser
import com.github.badoualy.telegram.tl.api.TLMessageActionChatEditTitle
import com.github.badoualy.telegram.tl.api.TLMessageActionChatJoinedByLink

val TLAbsMessageAction.title: String?
    get() = when (this) {
        is TLMessageActionChannelCreate -> title
        is TLMessageActionChatCreate -> title
        is TLMessageActionChatEditTitle -> title
        is TLMessageActionChannelMigrateFrom -> title
        else -> null
    }

val TLAbsMessageAction.userIdList: IntArray?
    get() = when (this) {
        is TLMessageActionChatAddUser -> users.toIntArray()
        is TLMessageActionChatCreate -> users.toIntArray()
        is TLMessageActionChatDeleteUser -> intArrayOf(userId)
        is TLMessageActionChatJoinedByLink -> intArrayOf(inviterId)
        else -> null
    }
