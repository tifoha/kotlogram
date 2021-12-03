package com.github.badoualy.telegram.api

import com.github.badoualy.telegram.tl.api.TLUpdateShort
import com.github.badoualy.telegram.tl.api.TLUpdateShortChatMessage
import com.github.badoualy.telegram.tl.api.TLUpdateShortMessage
import com.github.badoualy.telegram.tl.api.TLUpdateShortSentMessage
import com.github.badoualy.telegram.tl.api.TLUpdates
import com.github.badoualy.telegram.tl.api.TLUpdatesCombined

interface UpdateCallback {

    fun onUpdates(client: TelegramClient, updates: TLUpdates)

    fun onUpdatesCombined(client: TelegramClient, updates: TLUpdatesCombined)

    fun onUpdateShort(client: TelegramClient, update: TLUpdateShort)

    fun onShortChatMessage(client: TelegramClient, message: TLUpdateShortChatMessage)

    fun onShortMessage(client: TelegramClient, message: TLUpdateShortMessage)

    fun onShortSentMessage(client: TelegramClient, message: TLUpdateShortSentMessage)

    fun onUpdateTooLong(client: TelegramClient)

}