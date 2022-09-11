import sun.applet.Main;

/**
 * @PackageName:PACKAGE_NAME
 * @className:${Name}
 * @Description:
 * @author:zhj
 * @Date:2022/5/1411:06
 */
public class Lwhc {
    public static void main(String[] args) {

        //公司名称
        String gsmc[]  ={"豆一逗贸易","蓝莓公司"};
        //统一社会信用代码
        String tyshxydm[]  ={"91110108657514647E","91110108443833896A"};
        //客户名称
        String  khmc[]={"草莓","杨玉英"};
        //证件号码
        String zjhm[]={"140226198106188083","540000198102251065"};
        //手机号码
        String sjhm[]={"18630743555","18033072124"};

        for(int i=0;i<sjhm.length;i++){
                //登记信息前缀
                System.out.println("--登记信息核查信息表(修改前4个值)");
                    String djxxpre="INSERT INTO T_MIVS_REGCHKINFO (ENTNM, UNISOCCDTCD, NMOFLGLPRSN, IDOFLGLPRSN, AGTNM, AGTID, OPNM, COTP, DOM, REGCPTL, DTEST, OPPRDFROM, OPPRDTO, REGSTS, REGAUTH, BIZSCP, DTAPPR, QUERYRELT, DATARESOURCEDATE, SYSTEMTYPECODE, TRANM, NM, ID, OPLOC, FDAMT, DTREG, COTYPE, M_MESGID, M_MESGREFID, UPDATEDATE, FEEDBACKCONTENT, CONTACTNAME, CONTACTPHONE, CRTDATETIME, ALTDATETIME, APPLYWORKDATE, APPLYAGENTSERIALNO, PROCSTS, PROCCD, RJCTINF, PACKREQMSGID, CUSMATTRIBUTE1, CUSMATTRIBUTE2, CUSMATTRIBUTE3, CUSMATTRIBUTE4, CUSMATTRIBUTE5, REMARK1, REMARK2, REMARK3) \n" +
                            "VALUES (";
                    String djxxend=" '', '', '秦玉婵', '', '', '', '', '', '', '', '', '', '', 'NTFD', '', '', '', '', '', '', '', '', '1', '2021061000166295', '2021061000166295', '20210610', null, null, null, '20210610103836167000', '20210610103836167000', '20210610', '28179837', '', '', '', '2021061000166295', null, null, null, null, null, null, null, null);";

                    String pj=djxxpre+"'"+gsmc[i]+"','"+tyshxydm[i]+"','"+khmc[i]+"','"+zjhm[i]+"',"+djxxend;
                System.out.println(pj);
                System.out.println();
                System.out.println();

        }






    }


    public static void djxx(){

        //登记信息前缀
        String djxxpre="INSERT INTO T_MIVS_REGCHKINFO (ENTNM, UNISOCCDTCD, NMOFLGLPRSN, IDOFLGLPRSN, AGTNM, AGTID, OPNM, COTP, DOM, REGCPTL, DTEST, OPPRDFROM, OPPRDTO, REGSTS, REGAUTH, BIZSCP, DTAPPR, QUERYRELT, DATARESOURCEDATE, SYSTEMTYPECODE, TRANM, NM, ID, OPLOC, FDAMT, DTREG, COTYPE, M_MESGID, M_MESGREFID, UPDATEDATE, FEEDBACKCONTENT, CONTACTNAME, CONTACTPHONE, CRTDATETIME, ALTDATETIME, APPLYWORKDATE, APPLYAGENTSERIALNO, PROCSTS, PROCCD, RJCTINF, PACKREQMSGID, CUSMATTRIBUTE1, CUSMATTRIBUTE2, CUSMATTRIBUTE3, CUSMATTRIBUTE4, CUSMATTRIBUTE5, REMARK1, REMARK2, REMARK3) \n" +
                "VALUES ('";
        String djxxend="', '', '', '秦玉婵', '', '', '', '', '', '', '', '', '', '', 'NTFD', '', '', '', '', '', '', '', '', '1', '2021061000166295', '2021061000166295', '20210610', null, null, null, '20210610103836167000', '20210610103836167000', '20210610', '28179837', '', '', '', '2021061000166295', null, null, null, null, null, null, null, null);";





    }
}
