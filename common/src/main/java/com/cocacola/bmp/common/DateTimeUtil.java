package com.cocacola.bmp.common;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class DateTimeUtil {
    // 默认日期时间格式
    private static final String DEFAULT_DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    private static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd";
    private static final String DEFAULT_TIME_FORMAT = "HH:mm:ss";

    /**
     * 获取当前时间并按照指定格式返回字符串形式的时间。
     * 如果未指定格式，则使用默认格式 "yyyy-MM-dd HH:mm:ss"。
     *
     * @param format 时间格式字符串，例如 "yyyy-MM-dd HH:mm:ss"
     * @return 格式化后的时间字符串
     */
    public static String getCurrentTime(String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format != null ? format : DEFAULT_DATE_TIME_FORMAT);
        LocalDateTime now = LocalDateTime.now();
        return now.format(formatter);
    }


    /**
     * 获取当前时间并按照默认格式返回字符串形式的时间。
     *
     * @return 格式化后的时间字符串
     */
    public static String getCurrentTime() {
        return getCurrentTime(DEFAULT_DATE_TIME_FORMAT);
    }

    /**
     * 解析日期时间字符串为 LocalDateTime 对象。
     *
     * @param dateTimeStr 日期时间字符串
     * @param format      时间格式字符串，例如 "yyyy-MM-dd HH:mm:ss"
     * @return 解析后的 LocalDateTime 对象
     */
    public static LocalDateTime parseDateTime(String dateTimeStr, String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format != null ? format : DEFAULT_DATE_TIME_FORMAT);
        return LocalDateTime.parse(dateTimeStr, formatter);
    }

    /**
     * 解析日期字符串为 LocalDate 对象。
     *
     * @param dateStr 日期字符串
     * @param format  时间格式字符串，例如 "yyyy-MM-dd"
     * @return 解析后的 LocalDate 对象
     */
    public static java.time.LocalDate parseDate(String dateStr, String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format != null ? format : DEFAULT_DATE_FORMAT);
        return java.time.LocalDate.parse(dateStr, formatter);
    }

    /**
     * 解析时间字符串为 LocalTime 对象。
     *
     * @param timeStr 时间字符串
     * @param format  时间格式字符串，例如 "HH:mm:ss"
     * @return 解析后的 LocalTime 对象
     */
    public static java.time.LocalTime parseTime(String timeStr, String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format != null ? format : DEFAULT_TIME_FORMAT);
        return java.time.LocalTime.parse(timeStr, formatter);
    }

    /**
     * 计算两个日期之间的时间差。
     *
     * @param startDate 开始日期
     * @param endDate   结束日期
     * @param unit      时间单位（ChronoUnit）
     * @return 时间差
     */
    public static long calculateDurationBetweenDates(LocalDateTime startDate, LocalDateTime endDate, ChronoUnit unit) {
        return unit.between(startDate, endDate);
    }

    /**
     * 获取当前时间的 ZonedDateTime 对象。
     *
     * @param zoneId 时区 ID，例如 "Asia/Shanghai"
     * @return 当前时间的 ZonedDateTime 对象
     */
    public static ZonedDateTime getCurrentZonedDateTime(String zoneId) {
        ZoneId zone = ZoneId.of(zoneId != null ? zoneId : "UTC");
        return ZonedDateTime.now(zone);
    }
}
