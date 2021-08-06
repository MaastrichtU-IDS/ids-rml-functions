package org.semanticscience.d2s.functions;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.WordUtils;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

public class StringFunctions {

    /**
     * Returns the array of strings obtained by splitting `s` at wherever `sep` is found in it.
     * `sep` can be either a string or a regular expression.
     * For example, `split("fire, water, earth, air", ",")` returns the array of 4 strings:
     * "fire", " water", " earth" , and " air".
     * The double quotation marks are shown here only to highlight the fact that the spaces are retained.
     *
     * @param s   string
     * @param sep separator
     * @param prefix prefix to add
     * @return the array of strings obtained by splitting `s` at wherever `sep` is found in it
     */
    public static List<String> stringProcess(String s, String sep, String prefix) {
    	if(s== null || s.isEmpty()) {
    		return null;
    	}
    	List<String> resultList = Arrays.asList(s.split(sep));
    	if(prefix != null && !prefix.isEmpty()) {
    		for (int i = 0; i < resultList.size(); i++) {
    			resultList.set(i, prefix + resultList.get(i));
    		}
    	}
        return resultList;
    }


}
