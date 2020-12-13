package com.ljx.hello;

public class SqlMatch {
	/**
	 * 应收票据独占查询是.
	 */
	public static final String QUERY_YSPJ_KY = "SELECT GLDX.DXID,GLDX.PBANKNAME,GLDX.CPR,GLDX.{2} CDR,"
		 + " GLDX.HOLDERACCNAME,GLDX.HOLDERACC,GLDX.HOLDERBANKNO,GLDX.HOLDERORGNO,GLDX.PJZRBZ,"
		 + " GLDX.DXMC,GLDX.HOLDERBANKCODE,CAST(DECODE(GLDX.BILLTYPE,0,''银行承兑票据'','''') AS VARCHAR2(30)) AS BILLTYPE,"
		 + " GLDX.PMJE,GLDX.COMPID, GLDX.COMPID XTDW,C.COMPNAME MC,"
		 + " CPRQ,  DQR,"
		 + " CAST(CEIL(GLDX.DQR - SYSDATE) AS NUMBER) AS JLDQR,"
		 + " GLDX.BILLMEDIUM,GLDX.BILLJZ,DECODE(GLDX.BILLMEDIUM,1,''电子票据'',0,''纸质票据'') PJJZOLD,"
		 + " GLDX.BILLJZ PJJZNEW, GLDX.FPDWMC, GLDX.ACCEPTORACCNAME,E.ENUMVALUE BILLLX "  
		 + " FROM {0}.XTGLDX5015 GLDX,"
		 + " (SELECT A.PJDXID FROM {0}.T_PS_ZFXXSTATUS B,{0}.T_PS_ZFXX A "
		 + " WHERE A.ZJZFID=B.ZJZFID(+) "
		 + "  AND NVL(B.ZFZT,1) IN(1,2,3) AND NVL(A.PJDXID,0)>0"
		 + " UNION ALL SELECT BILLGID PJDXID FROM {0}.GET_YWDJ_SJ1 WHERE NVL(BILLGID,0)>0) B,"
		 + " {0}.COMPANYINFO C, {0}.XTENUMBANK E "
		 + " WHERE GLDX.DXID = B.PJDXID(+) "
//		 + " AND GLDX.PJZT IN (''00000009'',''00000001'',''00000008'') "
		 + " AND NVL(GLDX.BILLTYPE, 0)=0 AND NVL(GLDX.DXTYBZ,0) = 0"
		 + " AND C.COMPID(+)=TRIM(GLDX.COMPID)"
		 + " AND E.ENUMID(+)=GLDX.BILLLX AND E.ENUMLXID(+)=''50001027'' "
		 + " {1}"
		 + " AND B.PJDXID IS NULL";
	public static void main(String[] args) {
		String sql = "sfafadd aefeag eqatg ISHAIER";
		//判断是否存在海尔标志
		String sql2 = sql;
		final StringBuilder sb = new StringBuilder(QUERY_YSPJ_KY);
		if (sql2.indexOf("ISHAIER") > -1) {
			sql2 = sql.replace("ISHAIER", "");
			final int index = sb.indexOf("FROM {0}.XTGLDX5015 GLDX,");
			sb.insert(index - 1, ",GLDX.SOURCESYSTEM,GLDX.RECVBANKNAME, GLDX.ACCEPTORBANKNAME");
		}
		System.out.println(sb.toString());
	}
}
