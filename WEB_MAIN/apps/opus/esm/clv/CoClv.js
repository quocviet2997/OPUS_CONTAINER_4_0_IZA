if(typeof msgs == "undefined"){
	msgs = new Array();
}

msgs['ERR00001'] = "Msg Cd is mismatch format. Please check again.";
msgs['ERR00002'] = "Msg Cd is duplicated. Please check again.";
msgs['ERR00003'] = "Msg Cd is wrong. Please check again.";
msgs['INV00001'] = "DO SOMETHING";
msgs['INV10001'] = "Partner field is invalid.";
msgs['INV10002'] = "Lane field is invalid.";
msgs['INV10003'] = "Trade field is invalid.";
msgs['INV20001'] = "From date is greater than to date.";
msgs['INV20002'] = "The gap between months is over 3 months.";
msgs['SAV00000'] = "There is no Saving Data.";
msgs['SAV00001'] = "Save progress success.";
msgs['EXL00001'] = "Can't download Excel file because there are no data in it.";


const master_invoice_enum = Object.freeze({"partner":1, "lane":2, "invoice_no":3, "slip_no":4, "approved":5, "curr.":6, "revenue":7, "expense":8, "code":9, "name":10});

const detail_invoice_enum = Object.freeze({"partner":1, "lane":2, "invoice_no":3, "slip_no":4, "approved":5, "rev_exp":6, "item":7, "curr.":8, "revenue":9, "expense":10, "code":11, "name":12});
