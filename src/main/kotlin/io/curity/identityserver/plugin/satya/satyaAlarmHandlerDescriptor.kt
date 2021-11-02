package io.curity.identityserver.plugin.satya;

import se.curity.identityserver.sdk.plugin.descriptor.AlarmHandlerPluginDescriptor;
import se.curity.identityserver.sdk.alarm.AlarmHandler;

class satyaAlarmHandlerDescriptor: AlarmHandlerPluginDescriptor<satyaAlarmHandlerConfig>
{
    override fun getAlarmHandler() = satyaAlarmHandler::class.java

    override fun getPluginImplementationType() = "satya"

    override fun getConfigurationType() = satyaAlarmHandlerConfig::class.java;
}
