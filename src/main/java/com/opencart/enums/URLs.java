package com.opencart.enums;

public enum URLs {
    BASE_URL("http://localhost/opencart/upload/index.php"),
    ADMIN_URL("http://localhost/opencart/upload/admin/index.php");

    private String value;

    private URLs(String url)
    {
        this.value = url;
    }

    public String getUrl() {
        return value;
    }
}
