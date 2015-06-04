package com.satan.cimchat.network;

import com.loopj.android.http.RequestParams;
import com.loopj.android.http.TextHttpResponseHandler;

/**
 * Created by Administrator on 2015/5/31.
 */
public class UserAPI extends BaseAPI {

    private static String URL = "http://192.168.255.102:8080/ichat-server/cgi";

    /**
     * ע��
     *
     * @param username
     * @param password
     * @param responseHandler
     */
    public static void register(String username, String password, TextHttpResponseHandler responseHandler) {
        RequestParams params = new RequestParams();
        params.put("username", username);
        params.put("password", password);
        postAsyncHttpResponse(URL + "/user_register.api", params, responseHandler);
    }

    /**
     * ��¼
     *
     * @param account
     * @param password
     * @param responseHandler
     */
    public static void login(String account, String password, TextHttpResponseHandler responseHandler) {
        RequestParams params = new RequestParams();
        params.put("account", account);
        params.put("password", password);
        postAsyncHttpResponse(URL + "/user_login.api", params, responseHandler);
    }

    /**
     * ��ȡ�����û�
     *
     * @param responseHandler
     */
    public static void getAllUser(TextHttpResponseHandler responseHandler) {

        postAsyncHttpResponse(URL + "/user_getAllUser.api", null, responseHandler);
    }

    /**
     * ��ȡ�ҵ�����
     *
     * @param id
     * @param responseHandler
     */
    public static void getFreind(int id, TextHttpResponseHandler responseHandler) {
        RequestParams params = new RequestParams();
        params.put("id", id);
        postAsyncHttpResponse(URL + "/user_getFriend.api", params, responseHandler);
    }

}
