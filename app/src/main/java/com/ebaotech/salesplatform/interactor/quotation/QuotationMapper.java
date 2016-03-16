package com.ebaotech.salesplatform.interactor.quotation;

import com.ebaotech.salesplatform.core.bo.QuotationBo;
import com.ebaotech.salesplatform.domain.Quotation;

import java.util.ArrayList;
import java.util.List;

public class QuotationMapper {

    public static Quotation convertQuotationBoToDomain(QuotationBo quotationBo) {
        Quotation quotation = new Quotation();
        quotation.setQuotationId(quotationBo.getQuotationId().toString());
        quotation.setPremium(quotationBo.getPremium());
        quotation.setProductId(quotationBo.getProductId());
        quotation.setSA(quotationBo.getSA());

//        if (customerBo.getAddresses() != null) {
//            customer.setAddresses(convertAddressListToDomain(customerBo.getAddresses()));
//        }
//        if (customerBo.getFamilyMembers() != null) {
//            customer.setFamilyMembers(convertFamilyMemberListToDomain(customerBo.getFamilyMembers()));
//        }
        return quotation;
    }

    public static List<Quotation> convertQuotationBoListToDomain(List<QuotationBo> quotationBoList) {
        List<Quotation> quotationList = new ArrayList<>();
        for (QuotationBo bo : quotationBoList) {
            quotationList.add(convertQuotationBoToDomain(bo));
        }
        return quotationList;
    }

}
