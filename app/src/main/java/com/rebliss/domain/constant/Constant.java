package com.rebliss.domain.constant;

import com.rebliss.domain.model.ActivitySelectModel;
import org.jetbrains.annotations.Nullable;
import java.util.ArrayList;
import java.util.List;

public class Constant {
    public static final String MYPREF = "rebliss";
    public static final String NETWIRK_ERROR = "There are some connection issue";
    public static final String UNEXPECTED = "There are some Unexpected issue";
    public static final String ERROR_400 = " invalid request message parameters, or deceptive request routing etc";
    public static final String ERROR_401 = " Unauthorized user";
    public static final String ERROR_403 = " Forbidden error";
    public static final String ERROR_404 = "  REST API can’t map the client’s URI to a resource but may be available in the future";
    public static final String ERROR_405 = " API call method GET /POST Method Not Allowed";
    public static final String ERROR_500 = " Internal Server Error";
    public static final String ERROR_INVALID_JSON = " The data couldn’t be read because it isn’t in the correct format.";
    public static final String LATO_BLACK_ITALIC = "font/Lato-BlackItalic.ttf";
    public static final String LATO_BOLD = "font/Lato-Bold.ttf";
    public static final String LATO_REGULAR = "font/Lato-Regular.ttf";
    public static final String LATO_SEMI_BOLD = "font/Lato-Semibold.ttf";
    public static final String LATO_SEMI_BOLD_ITALIC = "font/Lato-SemiboldItalic.ttf";
    public static final String ARIAL_REGULAR = "font/Arial-Regular.ttf";
    public static final String IMAGE_TYPE_JPG = "jpg";
    public static final String IMAGE_TYPE_JPEG = "jpeg";
    public static final String IMAGE_TYPE_PNG = "png";
    public static final int TYPE_SUCCESS = 0;
    public static final int TYPE_ERROR = 1;
    public static final String TITLE = "Message!";
    public static final String APP_NOT_REGISTER = "App is not registered with Google, Please wait or launch app again!";
    public static final int FRAGMENT_KYC = 2;
    public static final String FRAGMENT_TYPE = "fragment_type";
    public static final String BANK_ACTION = "action";
    public static final String BANK_AGENT_ID = "agentId";
    public static final String BANK_EMAIL = "emailId";
    public static final String BANK_CHECKSUM = "checksum";
    public static final String BANK_MD_ID = "mdId";
    public static final String TOKEN = "token";
    public static final String FOSTOKEN = "fos_token";
    public static final String TOKEN_BASE_64 = "token_base";
    public static final String TOKEN_BASE_64_FOS = "token_base_fos";
    public static final String USER_ID = "id";
    public static final String USER_FIRST_NAME = "first_name";
    public static final String USER_LAST_NAME = "last_name";
    public static final String USER_EMAIl = "email";
    public static final String USER_PHONE = "phone_number";
    public static final String USER_VERIFYED = "mobile_verified";
    public static final String USER_PROFILE_VERIFYED = "profile_verified";
    public static final String USER_GROUP_ID = "user_group_id";
    public static final String USER_FOS_TYPE = "user_fos_type";
    public static final String USER_FOS_TYPES= "user_fos_type";
    public static final String USER_GROUP_DETAIL_ID = "user_group_detail_id";
    public static final String USER_UNIQUE_REF_CODE = "unique_code";
    public static final String USER_IID = "user_id";
    public static final String USER_EDUCATION = "user_education";
    public static final String CATEGORY_ID = "category_id";
    public static final String COMING_FROM = "coming_from";
    public static final String DEVICE_FCM_TOKEN = "device_token";
    public static final String IS_TODAY_FIRST = "is_today_first";
    public static final String UNAUTHORISE_TOKEN = "unauthorize_token";
    public static final String UNAUTHORISE_TOKEN_MESSAGE = "Your token has been expired";
    public static final String USER_LOCATION = "location_user";
    public static final String USER_OCCUPATION = "occupation_user";
    public static final String USER_AGR_RANGE = "age_range_user";
    public static final String USER_GENDER = "gender";
    public static final String PARTNER_TYPE = "partner_type";
    public static final String CP_GROUP_ID = "1";
    public static final String FOS_GROUP_ID = "2";
    public static final String POS_GROUP_ID = "3";
    public static final String SUPER_CP_GROUP_ID = "4";
    public static final String EMPLOYEE_GROUP_ID = "7";
    public static final String CHANNEL_GROUP_ID = "group_id";
    public static final String CHANNEL_GROUP_NAME = "group_name";
    public static final String YOUTUBE_API = "AIzaSyCnaLtY2ZAok8f90FJ8VeSVSSO25UmfI8w";
    //********************************** API URLs ***************************************




    public static final String kBaseURL = "http://3.111.233.121/api/web/v1/";//Production
  //  public static final String kBaseURL = "http://164.52.209.160:9016/api/web/v1/";//Production
    public static final String kBaseURL_Download_Invoice = "http://13.232.81.97/orders/print-report?id="; //for invoicedownload
   // public static final String kBaseURL_Download_Invoice = "http://164.52.209.160:9016/orders/print-report?id="; //for invoicedownload
   public static final String kBaseURL_Download_Image = "http://13.232.81.97/uploads/"; //for image
   // public static final String kBaseURL_Download_Image = "http://164.52.209.160:9016/uploads/"; //for image
    public static final String kBaseURL_RazorPay = "https://api.razorpay.com/v1/";
     //public static final String paymentdetail = "http://164.52.209.160:9016/api/web/v1/";
    public static final String paymentdetail = "http://13.232.81.97/api/web/v1/";
    public static final String kOpenCartSiteUrl = "http://rebliss.in/shop/";

//***************************************  USer Page URL ***************************************

    public static final String K_POST_SET_PASSWORD = "user/set-password";
    public static final String K_POST_GROUP_ID = "user/update-groupid";
    public static final String K_POST_UPDATE_PARTNER_TYPE = "user/update-cp-type";

    public static final String K_POST_LOGIN = "user/login";
    public static final String K_POST_REGISTER = "user/register";
    public static final String K_POST_REGISTER_RBS = "user/register-by-rbs";
    public static final String K_POST_REGISTER_RBS_BY_RBS = "user/register-rbs-by-rbs";
    public static final String K_APP_VERSION = "user/app-version";
    public static final String K_APP_BANNER = "group/app-banner";
    public static final String K_POST_FOS_REGISTER = "user/register";
    public static final String K_POST_BANK_IT_SHOW_HIDE = "user/user-bankit-data";
    public static final String K_POST_VERIFY_OTP = "user/verify-sms";
    public static final String K_POST_FORGOT_PASSWORD = "user/forgot-password";
    public static final String K_GET_USER_PROFILE = "user/get-profile";
    public static final String K_GET_HOME_CAROUSEL = "group/app-carousel";
    public static final String K_POST_USER_PROFILE_IMAGE = "group/user-profile-image";
    public static final String K_GET_USER_LOGOUT = "user/logout";
    public static final String K_CHECK_KYC = "user/check-kyc";
    public static final String K_POST_EDIT_PROFILE = "user/edit-profile";
    public static final String K_POST_UPLOAD_FILE = "user/upload-files";
    public static final String K_POST_UPLOAD_ShOP_IMAGE = "extra/upload-shop-image";
    public static final String K_GET_FOS_DETAILs = "user/get-f-o-s-details";
    public static final String K_GET_FOS_POS = "group/get-f-o-s-and-p-o-s";
    public static final String K_GET_FOS_POS_TEST = "group/get-f-o-s-and-p-o-s-test";
    public static final String K_GET_STATE = "address/get-state";
    public static final String K_GET_City = "address/get-citys";
    public static final String K_GET_RESEND = "user/resend-otp";
    public static final String K_POST_CHANGE_PASSWORD = "user/change-password";
    public static final String K_GET_STATE_CITY = "address/get-state-city";
    public static final String K_POST_DECLINE = "user/decline";
    public static final String K_POST_APPROVE = "user/approve";
    public static final String K_GET_INDUSTRY_TYPE = "master/get-industrys";
    public static final String K_GET_EARNING_SUMMARY = "group/earning-summary";
    public static final String K_GET_CHECK_PAYOUT_CATEGORY = "group/check-payout-by-category";
    public static final String K_GET_WITHDRAW_TASK_AMOUNT = "group/withdraw-task-amount";
    public static final String K_GET_CHECK_PAYOUT = "group/check-payout";
    public static final String K_POST_CUDEL = "group/activity-by-form";
    public static final String K_POST_Daily_DSR_Report = "group/daily-dsr-report";
    public static final String K_UPDATE_USER_PROFILE = "group/update-user-profile";
    public static final String K_GET_CATEGORY = "group/get-category";
    public static final String K_GET_SUB_CATEGORY = "group/get-sub-category";
    public static final String K_GET_MOBILE_STATUS = "group/check-phone";
    public static final String K_ACTIVITY_TASK = "group/activity-task";
    public static final String K_ACTIVITY_TASK_TEST = "group/activity-task-test";
    public static final String K_GET_TRAINING = "group/training-list";
    public static final String K_GET_MY_EARNING = "group/my-earning";
    public static final String K_POST_CHECK_VALIDATION = "group/check-category-validation";
    public static final String K_GET_SAVE_MY_ACTIVITY = "group/save-activity-detail";
    public static final String K_GET_SAVE_UPDATE_ACTIVITY = "group/update-activity-detail";
    public static final String K_GET_SAVE_ACTIVITY_DETAIL = "group/activity-by-id";
    public static final String K_GET_SAVE_MY_ACTIVITY_LIST = "group/my-activity";
    public static final String K_GET_SAVE_MY_ACTIVITY_LIST_TEST = "group/my-activity-test";
    public static final String K_GET_SAVE_MY_ACTIVITY_LIST_TEST_TWO = "group/my-activity-test-two";
    public static final String K_GET_SAVE_MY_DECLINED_ACTIVITY_LIST = "group/my-declined-activity";
    public static final String K_POST_fosattendancestatus = "group/fos-attendance-status";
    public static final String K_POST_fosattendance = "group/fos-attendance";
    public static final String K_POST_opportunitylist = "group/opportunity-list";
    public static final String K_POST_fosopportunity = "group/fos-opportunity";
    public static final String K_GET_GET_CP_FILTER = "group/cp-filter";
    public static final String K_POST_cplist = "group/fos-by-cp";
    public static final String K_GET_SHOP_CATEGORY = "group/shop-detail";
    public static final String K_GET_GET_EMPLOYEE_FILTER = "group/employee-filter";
    public static final String K_POST_fosbyemplyee = "group/fos-by-employee";
    public static final String K_GET_NOTIFICATION_LIST = "group/user-notification";
    public static final String K_GET_NOTIFICATION_UPDATE_STATUS = "group/chnage-notification-status";
    public static final String K_GET_PAYMENT_DETAIL = "group/payment-detail";
    public static final String K_GET_PAYMENT_DETAIL_TEST = "group/payment-detail-test";
    public static final String K_GET_INSURANCE_AMOUNT = "group/find-insurance-amount";
    public static final String K_GET_ADDRESS_DETAIL = "group/cp-address-detail";
    public static final String K_UPDATE_ADDRESS_DETAIL = "group/cp-address-update";
    public static final String K_SUBMIT_ORDEE = "group/submit-order";
    public static final String K_GET_ORDERS = "orders";
    public static final String K_GET_INVOICE_LIST = "group/find-invoice";
    public static final String K_GET_DEMAND_PARTNER_NAME = "group/get-sub-category-for-dsr";
    public static final String K_GET_WEBVIEW_PINE_LABS = "group/web-view-for-pine-lab";
    //************************************  Account Type ***************************************
    public static final String K_GET_GROUP = "group/get-groups";

    //************************************  Upload Type ***************************************
    public static final String K_AADHAAR = "aadhaar";
    public static final String K_PAN = "pan";
    public static final String K_IBDA = "ibda";
    public static final String K_FIRM_PAN = "firm_pan";
    public static final String K_ADDRESS = "address";
    public static final String K_GST = "gst";
    public static final String K_CHEQUE = "cheque";
    public static final String K_PASSPORT = "passport";
    public static final String K_SIGNED = "signed";
    public static final String K_SHOP = "shop";
    public static final String K_DAILY_DEDUCTION = "group/daily-deduction";
    public static final String K_CHECK_TODAY_DEDUCTION = "group/check-today-deduction";
    public static final String K_EARNING_ON_TASK = "group/earning-on-task";
    public static final String K_CHECK_ORDER_CP = "group/check-order-for-cp";
    public static final String K_USER_CURRENT_LOCATION = "group/user-current-location";
    public static final String K_SEARCH_RBM_RBS = "extra/search-rbm-by-rbs";
    public static final String K_SEARCH_RBM_RBS_NEW = "extra/search-rbm-or-rbs-by-rbs";
    public static final String K_FIND_RBM_DETAIL = "extra/find-rbm-detail";
    public static final String K_GET_SERVICE = " extra/get-service";
    public static final String K_POST_SAVE_REFRENCE = "extra/save-fos-reference";
    public static final String K_POST_UPDATE_RBM_ADDRESS = "extra/update-rbm-address";
    public static final String K_POST_SAVE_SERVICES = "extra/save-services";
    public static final String K_POST_SAVE_PERSONAL_DETAILS = "extra/save-personal-details";
    public static final String K_POST_SAVE_ASSIGNMENT_DETAILS = "extra/save-fos-assignment";
    public static final String K_POST_SAVE_ASSIGNMENT_DETAILS_NEW = "extra/save-fos-assignment-preview";
    public static final String K_GET_REFRENCE_DATA = "extra/get-fos-reference";
    public static final String K_POST_WORK_PROFILE = "extra/save-work-profile";
    public static final String K_POST_SELF_KYC = "extra/save-self-kyc";
    public static final String K_POST_WORK_KYC = "extra/save-work-kyc";
    public static final String K_FIND_SATHI_STATUS = "extra/check-profile-status";
    public static final String K_CHECK_DUPLICATE_REFERENCE = "extra/check-duplicate-reference";
    public static final String K_SEARCH_SATHI_RECORDS = "user/search-sathi-record";
    public static final String K_POST_UPDATE_STATUS = "extra/update-profile-status";
    public static final String K_GET_DEMAND_PARTNER_NAME_SATHI = "group/search-sub-category-for-sathi";
    public static final String K_GET_ASSIGNMENT_PREVIEW = "extra/assignment-on-preview";
    public static List<ActivitySelectModel> activitiesList = new ArrayList<>();
    @Nullable
    public static final String EARNING_TASK_ID = "earning_task_id";
    @Nullable
    public static final String OPPORTUNITY_TITLE = "opportunity_title";
    public static final String K_GET_DEMAND_PARTNER_APP_LINK = "group/demand-partner-app-link";
    public static final String GET_DOCUMENT_BY_USER = "document/get-document-by-user";
}
