package com.github.badoualy.telegram.api.utils

import com.github.badoualy.telegram.tl.api.TLAbsChat
import com.github.badoualy.telegram.tl.api.TLChannel
import com.github.badoualy.telegram.tl.api.TLChannelForbidden
import com.github.badoualy.telegram.tl.api.TLChat
import com.github.badoualy.telegram.tl.api.TLChatEmpty
import com.github.badoualy.telegram.tl.api.TLChatForbidden

val TLAbsChat?.title: String?
    get() = when (this) {
        is TLChannel -> title
        is TLChannelForbidden -> title
        is TLChat -> title
        is TLChatForbidden -> title
        is TLChatEmpty -> null
        else -> null
    }