package labmon.app;

/**
 * Created by Kohmei on 2016/05/17.
 */


class Lab {

    private String[] title = {
            "岩田研究室",
            "植田研究室",
            "鵜川研究室",
            "門田研究室",
            "栗原研究室",
            "敷田研究室",
            "繁桝研究室",
            "篠森研究室",
            "清水研究室",
            "高田研究室",
            "中原研究室",
            "濱村研究室",
            "福本研究室",
            "松崎研究室",
            "妻鳥研究室",
            "横山研究室",
            "吉田研究室",
            "任研究室",
    };

    class Labs extends Lab {

        /*
        for (int i = 0; i < title.length; i++) {
            private String[] name = title(i);
        }
        */

        private String[] anothertitle = {
                "Iwata Lab",
                "別名2",
                "別名3",
                "別名4",
                "別名5",
                "別名6",
                "別名7",
                "別名8",
                "別名9",
                "別名10",
                "別名11",
                "別名12",
                "別名13",
                "別名14",
                "別名15",
                "別名16",
                "別名17",
                "別名18"
        };

        private String[] dececription = {
                "当研究室では ヒトや環境にやさしいICT技術に必要なディペンダブル・マルチプロセッサLSIとそれを応用した各種ICT機器の構成法に関して研究しています。加えて、脳のような知的なコンピュータの研究開発を目標にして、総合研究所の脳コミュニケーション研究センターと連携して研究する準備もすすめています。",
                "文書2",
                "文書3",
                "文書4",
                "文書5",
                "文書6",
                "文書7",
                "文書8",
                "文書9",
                "文書10",
                "文書11",
                "文書12",
                "文書13",
                "文書14",
                "文書15",
                "文書16",
                "文書17",
                "文書18"
        };

        public String anothertitle(int number){
            String res = "error";
            // 配列要素外ではエラーとする
            if(anothertitle.length > number){
                res = anothertitle[number];
            }
            return res;
        }

        public String dececription(int number){
            String res = "error";
            // 配列要素外ではエラーとする
            if(dececription.length > number){
                res = dececription[number];
            }
            return res;
        }

        // コンストラクター
        public Labs(){

        }

    }

    // コンストラクター
    public Lab(){

    }

    public String title(int number){
        String res = "error";
        // 配列要素外ではエラーとする
        if(title.length > number){
            res = title[number];
        }
        return res;
    }
}