package com.ebaotech.salesplatform.interactor.quotation;

import com.ebaotech.salesplatform.domain.Quotation;

/**
 *
 */
public interface GetQuotation {
    void getQuotation(String quotationId, Callback callback);

    void newQuotation(String policyHolderId, Callback callback);

    interface Callback {
        void onQuotationLoaded(Quotation quotation);
        void onError(Exception e);
    }
}
