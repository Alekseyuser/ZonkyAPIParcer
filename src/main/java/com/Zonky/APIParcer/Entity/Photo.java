package com.Zonky.APIParcer.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Photo  implements Serializable {
    @Id
    private Integer id;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    private String name;
    private String url;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) { this.url = url; }
}
