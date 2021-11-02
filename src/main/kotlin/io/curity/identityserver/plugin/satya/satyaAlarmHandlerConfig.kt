package io.curity.identityserver.plugin.satya;

import se.curity.identityserver.sdk.config.Configuration;
import se.curity.identityserver.sdk.config.annotation.Description;

interface satyaAlarmHandlerConfig: Configuration
{
    @Description("A parameter used for demo purposes")
    fun getDemoParameter(): Int;
}
