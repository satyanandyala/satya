package io.curity.identityserver.plugin.satya;

import se.curity.identityserver.sdk.alarm.Alarm;
import se.curity.identityserver.sdk.alarm.AlarmHandler;

class satyaAlarmHandler(private val _configuration: satyaAlarmHandlerConfig): AlarmHandler
{
    override fun handle(alarm: Alarm)
    {
        // TODO: Implement handling an alarm, e.g. send to an external reporting system.
        // Check out the examples on GitHub: https://github.com/search?q=alarm+org%3Acurityio&type=Repositories
    }
}
