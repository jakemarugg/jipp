// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2018-04-06
@file:Suppress("MaxLineLength")

package com.hp.jipp.pwg

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports
import com.hp.jipp.util.getStaticObjects

/**
 * Subscription Template attribute types.
 */
object SubscriptionTemplate {

    /**
     * "notify-charset" as defined in:
     * [RFC3995](http://www.iana.org/go/rfc3995)
     */
    @JvmField val notifyCharset = StringType(Tag.charset, "notify-charset")

    /**
     * "notify-events" as defined in:
     * [RFC3995](http://www.iana.org/go/rfc3995)
     */
    @JvmField val notifyEvents = NotifyEvents.Type("notify-events")

    /**
     * "notify-lease-duration" as defined in:
     * [RFC3995](http://www.iana.org/go/rfc3995)
     */
    @JvmField val notifyLeaseDuration = IntegerType("notify-lease-duration")

    /**
     * "notify-max-events-supported" as defined in:
     * [RFC3995](http://www.iana.org/go/rfc3995)
     */
    @JvmField val notifyMaxEventsSupported = IntegerType("notify-max-events-supported")

    /**
     * "notify-pull-method" as defined in:
     * [RFC3995](http://www.iana.org/go/rfc3995)
     */
    @JvmField val notifyPullMethod = NotifyPullMethod.Type("notify-pull-method")

    /**
     * "notify-recipient-uri" as defined in:
     * [RFC3995](http://www.iana.org/go/rfc3995)
     */
    @JvmField val notifyRecipientUri = UriType("notify-recipient-uri")

    /**
     * "notify-time-interval" as defined in:
     * [RFC3995](http://www.iana.org/go/rfc3995)
     */
    @JvmField val notifyTimeInterval = IntegerType("notify-time-interval")

    /** All known attributes */
    @JvmField
    val all = SubscriptionTemplate::class.java.getStaticObjects()
            .filter { it is AttributeType<*> }
            .map { it as AttributeType<*> }
}