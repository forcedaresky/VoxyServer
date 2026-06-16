package com.dripps.voxyserver.network;

import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;

public class VoxyServerNetworking {

    public static final int PROTOCOL_VERSION = 1;

    public static void register() {
        PayloadTypeRegistry.playS2C().register(LODSectionPayload.TYPE, LODSectionPayload.CODEC);
        PayloadTypeRegistry.playS2C().register(LODBulkPayload.TYPE, LODBulkPayload.CODEC);
        PayloadTypeRegistry.playS2C().register(PreSerializedLodPayload.TYPE, PreSerializedLodPayload.CODEC);
        PayloadTypeRegistry.playS2C().register(LODClearPayload.TYPE, LODClearPayload.CODEC);
        PayloadTypeRegistry.playS2C().register(LODServerSettingsPayload.TYPE, LODServerSettingsPayload.CODEC);
        PayloadTypeRegistry.playS2C().register(LODProtocolPayload.TYPE, LODProtocolPayload.CODEC);

        PayloadTypeRegistry.playC2S().register(LODReadyPayload.TYPE, LODReadyPayload.CODEC);
        PayloadTypeRegistry.playC2S().register(LODPreferencesPayload.TYPE, LODPreferencesPayload.CODEC);
        PayloadTypeRegistry.playC2S().register(LODManifestPayload.TYPE, LODManifestPayload.CODEC);
        PayloadTypeRegistry.playC2S().register(LODHandshakePayload.TYPE, LODHandshakePayload.CODEC);
    }
}
