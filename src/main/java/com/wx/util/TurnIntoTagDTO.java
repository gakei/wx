package com.wx.util;

import com.sun.corba.se.spi.ior.ObjectKey;
import com.wx.dto.TagDTO;
import org.springframework.stereotype.Service;

import javax.swing.text.html.parser.TagElement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author WHJ
 * @description 把Tags从LinkedHashMap转成List<TagDTO>
 * @create 2021-04-02 11:35
 **/
public class TurnIntoTagDTO {
    public static List<TagDTO> turn(List<Object> tagsMap) {
        List<TagDTO> res = new ArrayList<>();
        for (Object tagMap : tagsMap) {
            LinkedHashMap<String, Object> tmp = (LinkedHashMap<String, Object>) tagMap;
            TagDTO tag = new TagDTO();
            tag.setId((Integer) tmp.get("id"));
            tag.setValue((String) tmp.get("value"));
            tag.setActive((Boolean) tmp.get("isActive"));
            res.add(tag);
        }
        return res;
    }
}
