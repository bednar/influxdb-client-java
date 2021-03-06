/*
 * Influx API Service
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.influxdb.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;

import com.influxdb.client.domain.*;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

public class JSON {
    private Gson gson;
    private DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();

    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
          .registerTypeSelector(CheckDiscriminator.class, new TypeSelector() {
            @Override
            public Class getClassForElement(JsonElement readElement) {
                Map classByDiscriminatorValue = new HashMap();
                classByDiscriminatorValue.put("deadman".toUpperCase(Locale.ROOT), DeadmanCheck.class);
                classByDiscriminatorValue.put("threshold".toUpperCase(Locale.ROOT), ThresholdCheck.class);
                classByDiscriminatorValue.put("CheckDiscriminator".toUpperCase(Locale.ROOT), CheckDiscriminator.class);
                return getClassByDiscriminator(
                            classByDiscriminatorValue,
                            getDiscriminatorValue(readElement, "type"));
            }
          })
          .registerTypeSelector(NotificationEndpointDiscrimator.class, new TypeSelector() {
            @Override
            public Class getClassForElement(JsonElement readElement) {
                Map classByDiscriminatorValue = new HashMap();
                classByDiscriminatorValue.put("slack".toUpperCase(Locale.ROOT), SlackNotificationEndpoint.class);
                classByDiscriminatorValue.put("pagerduty".toUpperCase(Locale.ROOT), PagerDutyNotificationEndpoint.class);
                classByDiscriminatorValue.put("http".toUpperCase(Locale.ROOT), HTTPNotificationEndpoint.class);
                classByDiscriminatorValue.put("NotificationEndpointDiscrimator".toUpperCase(Locale.ROOT), NotificationEndpointDiscrimator.class);
                return getClassByDiscriminator(
                            classByDiscriminatorValue,
                            getDiscriminatorValue(readElement, "type"));
            }
          })
          .registerTypeSelector(NotificationRuleDiscriminator.class, new TypeSelector() {
            @Override
            public Class getClassForElement(JsonElement readElement) {
                Map classByDiscriminatorValue = new HashMap();
                classByDiscriminatorValue.put("slack".toUpperCase(Locale.ROOT), SlackNotificationRule.class);
                classByDiscriminatorValue.put("smtp".toUpperCase(Locale.ROOT), SMTPNotificationRule.class);
                classByDiscriminatorValue.put("pagerduty".toUpperCase(Locale.ROOT), PagerDutyNotificationRule.class);
                classByDiscriminatorValue.put("http".toUpperCase(Locale.ROOT), HTTPNotificationRule.class);
                classByDiscriminatorValue.put("NotificationRuleDiscriminator".toUpperCase(Locale.ROOT), NotificationRuleDiscriminator.class);
                return getClassByDiscriminator(
                            classByDiscriminatorValue,
                            getDiscriminatorValue(readElement, "type"));
            }
          })
          .registerTypeSelector(Threshold.class, new TypeSelector() {
            @Override
            public Class getClassForElement(JsonElement readElement) {
                Map classByDiscriminatorValue = new HashMap();
                classByDiscriminatorValue.put("greater".toUpperCase(Locale.ROOT), GreaterThreshold.class);
                classByDiscriminatorValue.put("lesser".toUpperCase(Locale.ROOT), LesserThreshold.class);
                classByDiscriminatorValue.put("range".toUpperCase(Locale.ROOT), RangeThreshold.class);
                classByDiscriminatorValue.put("Threshold".toUpperCase(Locale.ROOT), Threshold.class);
                return getClassByDiscriminator(
                            classByDiscriminatorValue,
                            getDiscriminatorValue(readElement, "type"));
            }
          })
        
        ;
        return fireBuilder.createGsonBuilder();
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if(null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue.toUpperCase(Locale.ROOT));
        if(null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    public JSON() {
        gson = createGson()
            .registerTypeAdapter(Date.class, dateTypeAdapter)
            .registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter)
            .registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter)
            .registerTypeAdapter(LocalDate.class, localDateTypeAdapter)
            .registerTypeAdapter(PostNotificationEndpoint.class, (JsonSerializer<PostNotificationEndpoint>)
                (src, type, context) -> context.serialize(src, src.getClass()))
            .registerTypeAdapter(PostNotificationRule.class, (JsonSerializer<PostNotificationRule>)
                (src, type, context) -> context.serialize(src, src.getClass()))
            .registerTypeAdapter(PostCheck.class, (JsonSerializer<PostCheck>)
                (src, type, context) -> context.serialize(src, src.getClass()))
            .create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     * @return JSON
     */
    public JSON setGson(Gson gson) {
        this.gson = gson;
        return this;
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public JSON setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
        return this;
    }

    public JSON setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
        return this;
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {
        }

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {
        }

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public JSON setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
        return this;
    }

    public JSON setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
        return this;
    }

}
