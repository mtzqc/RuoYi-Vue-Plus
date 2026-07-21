package org.dromara.system.domain;

import lombok.Getter;

/**
 * 配置字段类型枚举
 *
 * @author Reasonix
 */
@Getter
public enum ConfigFieldType {

    /** 字符串 */
    STRING("string"),

    /** 整数 */
    INT("int"),

    /** 长整数 */
    LONG("long"),

    /** 浮点数 */
    FLOAT("float"),

    /** 双精度浮点数 */
    DOUBLE("double"),

    /** 布尔值 */
    BOOLEAN("boolean"),

    /** 精确小数 (BigDecimal) */
    DECIMAL("decimal"),

    /** JSON 对象 */
    JSON_OBJECT("jsonObject"),

    /** JSON 列表/数组 */
    JSON_LIST("jsonList");

    private final String value;

    ConfigFieldType(String value) {
        this.value = value;
    }

    /**
     * 根据字符串值查找对应的枚举，找不到返回 null
     */
    public static ConfigFieldType fromValue(String value) {
        for (ConfigFieldType type : values()) {
            if (type.value.equals(value)) {
                return type;
            }
        }
        return null;
    }

}
