package com.resources.pagination.index;

import java.io.Serializable;
import java.util.List;

public class DefaultIndexPagination<T> implements Serializable {

    private int displayPerPage = 10;
    private int currentPage = 1;
    private int totalResult = 0;
    private String searchString = "";
    private String viewTitle = "Danh sách chi tiết";
    private String orderColmn = "";
    private static final String ROOT_CONTROLLER = "";
    private String childrenController = "";
    private String viewName = null;
    private String insertViewName = null;
    private String editViewName = null;
    private boolean asc = true;
    private boolean insertable = true;
    private boolean exportable = true;
    private List<T> displayList = null;
    public static final String CONTAINER_FOLDER = "includes/index/container_content";
    public static final String AJAX_FOLDER = "includes/index/ajax_content";
    public static final String LOGIN_VIEW = "/login";
    public static final String REGISTER_VIEW = "/register";
    public static final String RESET_PASSWORD_VIEW = "/reset_password";
    public static final String CHANGE_PASSWORD_VIEW = "/change_pasword";
    public static final String MESSAGE_FOLDER = "includes/index/message_content";
    public static final String REDIRECT_FOLDER = "includes/index/redirect";
    public static final String REDIRECT_VIEW = "/redirect";
    private static final String ORDER_DATA = "/OrderData";
    private static final String DISPLAY_PER_PAGE = "/DisplayPerPage";
    private static final String GO_TO = "/GoTo";
    private static final String VIEW_INSERT = "/ViewInsert";
    private static final String VIEW_EDIT = "/ViewEdit";
    private static final String DELETE = "/Delete";

    public DefaultIndexPagination() {
    }

    public DefaultIndexPagination(int totalResult, String orderColmn, boolean insertable) {
        this.totalResult = totalResult;
        this.orderColmn = orderColmn;
        this.insertable = insertable;
    }

    public String getCHANGE_PASSWORD_VIEW() {
        return CHANGE_PASSWORD_VIEW;
    }
    
    public String getLOGIN_VIEW() {
        return LOGIN_VIEW;
    }

    public String getREGISTER_VIEW() {
        return REGISTER_VIEW;
    }

    public String getREDIRECT_FOLDER() {
        return REDIRECT_FOLDER;
    }

    public String getDELETE() {
        return DELETE;
    }

    public String getREDIRECT_VIEW() {
        return REDIRECT_VIEW;
    }

    public String getVIEW_EDIT() {
        return VIEW_EDIT;
    }

    public String getROOT_CONTROLLER() {
        return ROOT_CONTROLLER;
    }

    public String getCONTAINER_FOLDER() {
        return CONTAINER_FOLDER;
    }

    public String getAJAX_FOLDER() {
        return AJAX_FOLDER;
    }

    public String getORDER_DATA() {
        return ORDER_DATA;
    }

    public String getDISPLAY_PER_PAGE() {
        return DISPLAY_PER_PAGE;
    }

    public String getGO_TO() {
        return GO_TO;
    }

    public String getVIEW_INSERT() {
        return VIEW_INSERT;
    }

    public int getDisplayPerPage() {
        return displayPerPage;
    }

    public String getMESSAGE_FOLDER() {
        return MESSAGE_FOLDER;
    }

    public void setDisplayPerPage(int displayPerPage) {
        this.displayPerPage = displayPerPage;
        this.currentPage = 1;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalResult() {
        return totalResult;
    }

    public void setTotalResult(int totalResult) {
        this.totalResult = totalResult;
    }

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    public String getOrderColmn() {
        return orderColmn;
    }

    public void setOrderColmn(String orderColmn) {
        this.orderColmn = orderColmn;
    }

    public boolean isAsc() {
        return asc;
    }

    public void setAsc(boolean asc) {
        this.asc = asc;
    }

    public void setDisplayList(List<T> displayList) {
        this.displayList = displayList;
    }

    public List<T> getDisplayList() {
        return displayList;
    }

    public int getTotalPage() {
        return totalResult % displayPerPage > 0 ? totalResult / displayPerPage + 1 : totalResult / displayPerPage;
    }

    public int getFirstResult() {
        return (currentPage - 1) * displayPerPage;
    }

    public String getViewTitle() {
        return viewTitle;
    }

    public void setViewTitle(String viewTitle) {
        this.viewTitle = viewTitle;
    }

    public boolean isInsertable() {
        return insertable;
    }

    public void setInsertable(boolean insertable) {
        this.insertable = insertable;
    }

    public boolean isExportable() {
        return exportable;
    }

    public void setExportable(boolean exportable) {
        this.exportable = exportable;
    }

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    public String getInsertViewName() {
        return insertViewName;
    }

    public void setInsertViewName(String insertViewName) {
        this.insertViewName = insertViewName;
    }

    public String getChildrenController() {
        return childrenController;
    }

    public void setChildrenController(String childrenController) {
        this.childrenController = childrenController;
    }

    public String getEditViewName() {
        return editViewName;
    }

    public void setEditViewName(String editViewName) {
        this.editViewName = editViewName;
    }

}
