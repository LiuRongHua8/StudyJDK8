package com.iotknowyou.PracticeCode;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @title: Demo
 * @projectName StudyJDK8
 * @author: RongHua Liu
 * @date: 2019/11/14  15:01
 * @description: TODO
 */
public class Demo_10 {
    /* 定义 单词仓库 */
     public static Map<String ,String> WorldsStory = new LinkedHashMap<>();
     
     /* 添加单词到仓库中的方法*/
     public static void putWorlds(String key , String value){
         WorldsStory.put(key , value);
     }

     /* 真正添加到仓库中*/
     public static Boolean addWorlds(){
         putWorlds("worlds3621_3640", "manufacture 制造商," +
                 "long 长久的 ，长的，长久地 ," +
                 "old 老的，年老的，结识久的," +
                 "nuclear 核能的，使用核能的 使用核武器的，原子核的," +
                 "nucleus 原子核 ，细胞核 ," +
                 "rate 比率，速率，进度，价格， --动词： 评估，," +
                 "province 省，领域，职责范围," +
                 "theoretical 理论上的 假设的," +
                 "surgery 外科，外科手术," +
                 "vague 含糊的，不明确的," +
                 "unique 独一无二的，独特的," +
                 "weave 编制，编写，编造，编织," +
                 "approximate 大致的，大约的，大概的，接近," +
                 "cabinet 储藏柜，内阁," +
                 "buy --动词： 购买， --名词：买卖," +
                 "fail  失败," +
                 "failure  n 失败 失败的事情," +
                 "exterior  adj 外面的，外表的 ，外墙," +
                 "glance 瞥一眼 ，立刻");
         putWorlds("worlds3601_3620",  "offend v、 冒犯 ， 犯罪，违法," +
                 "number 数字 ，总数，numbers 复数," +
                 "railway 铁路，铁道," +
                 "punch  一拳 ，一击 ， 用拳猛击," +
                 "tense 时态 ，紧张的 ， 局势令人紧张的 ，紧张的局面 ," +
                 "tension  n  拉力 ，张力 ，," +
                 "," +
                 "underneath 在什么底下 ，底部，下表面," +
                 "twist 转动，缠绕 ," +
                 "weaken v 使虚弱," +
                 "volume n 容积，体积，音量," +
                 "bare 裸体的，赤裸的 无遮蔽的 最基本的 ， 使赤裸 ，," +
                 "arbitrary 任意的，随机的," +
                 "emergency 紧急情况，突然事件," +
                 "curse v   诅咒 ，骂人 ， 说咒语， 咒语，," +
                 "girl 女孩，nver," +
                 "fun  乐趣，快乐 ，有趣的 ， 取笑," +
                 "funny  adj  滑稽的  有趣的 ," +
                 "inform v 通知 ，告知," +
                 "household n 一家人  ");
         putWorlds("worlds3581_3600", "ball 球 ，球状物," +
                 "awake v 使醒来  adj 醒着的," +
                 "else  其他的," +
                 "cushion   坐垫 ，起保护和缓冲作用的事物," +
                 "bar 酒吧 、条 、 栏杆 ," +
                 "ash n  灰 灰烬 废墟," +
                 "emergency 浮现 ，," +
                 "curve 曲线，弯曲 ，," +
                 "gesture 手势 ，做手势，用动作示意," +
                 "fur ," +
                 "infinite  adj 无穷尽的，无法衡量的," +
                 "however  adv 然而 ，不管怎样," +
                 "kitchen 厨房 ," +
                 "invent   v 发明 ，创造," +
                 "invention n 发明，创造," +
                 "inventor 发明家," +
                 "manner  n  方式，方面，礼貌," +
                 "look  v  看，瞧 外观， 查找 ，注意 ，留神 ，表情，外观相貌," +
                 "namely  adv  ," +
                 "must 必须，一定");
         putWorlds("worlds3561_3580","sake n 理由，缘故," +
                 "royal adj 皇家的 ， n 皇室成员," +
                 "terrible  adj  非常讨厌的 ， 可怕的 ， 非常严重的," +
                 "urban 城市的，都市的," +
                 "abandon 放弃，抛弃 ，放任 ，放纵," +
                 "cabin  n  小屋 ， 船舱 ， ," +
                 "elaborate 复杂的 ， 精心制作," +
                 "germ  n 微生物 ， 微生物," +
                 "furnace  熔炉," +
                 "hardly  adv  几乎不 ，," +
                 "Indian 印度的 ，印度人," +
                 "hunt 打猎，寻找," +
                 "lack  v 缺乏 ，匮乏 ," +
                 "knee  膝关节 ，膝部 ," +
                 "kneel v 跪下 ，跪拜的动作," +
                 "need  n 需要 ," +
                 "mystery  n 神秘的事物 ," +
                 "Opera  歌剧 ，歌剧剧本" );
         putWorlds("worlds3541_3560", "purse  女士钱包 ，备用款," +
                 "bag  n  袋子 ，  v 装到袋子," +
                 "award  n 奖金，  v 授予," +
                 "edition n 版本 ," +
                 "custom  n 习俗 ，习性 ，定制的," +
                 "facility  n 设施，设备 ，场所 ," +
                 "eye  n 眼睛  v 注视," +
                 "eyesight n 视力  ," +
                 "geometry n 几何形状 ，几何结构 ," +
                 "furniture  n 家具 设备," +
                 "include  v 包括，包含," +
                 "hurry  急忙," +
                 "kill  v  杀死 ," +
                 "jump 跳跃," +
                 "maid  女仆," +
                 "lorry  n  运货汽车 ，卡车," +
                 "obvious adj  明显的，显而易见的 ," +
                 "nurse  n 护士    v  疗养， ," +
                 "range  n  一系列 ");
         putWorlds("worlds3521_3540", "talk  v  说话，谈话，讨论 交谈," +
                 "ultimate  adj  最后的， 最先进的," +
                 "vacant adj 空缺的 闲置的 ," +
                 "wage  n  周薪 ，," +
                 "bacteria n 细菌," +
                 "ambulance  n  救护车 ，," +
                 "eager adj 热切的，渴望的，渴求的," +
                 "cycle  n 循环，自行车   adj 骑自行车," +
                 "generous  adj 慷慨的，大方的 ," +
                 " ," +
                 "import  n 进口 ， 引进 进口," +
                 "hydrogen  n  氢气 ," +
                 "kick v 踢 踹," +
                 "issue n 重要议题 ，重要 ， v 宣布 发布 ," +
                 "journey  n 旅行 ," +
                 "magnificent  adj  壮观的 宏伟的 了不起的," +
                 "lot   大量的  a lot of   ， 一批  ， 可以指 待拍卖品 ， ," +
                 "oblige  v ," +
                 "nylon  n 尼龙布 尼龙," +
                 "quarrel v 争吵  ");
        putWorlds("worlds3501_3520","" +
                "argue v 争论 ，争吵," +
                "barrier  n 屏障 障碍物 隔阂," +
                "century n 世纪 ， 百年," +
                "earth n 地球 地面 接地线," +
                "face  n  脸 面孔 ， v 面对," +
                "gallon n 加仑 ， 一中液体单位," +
                "," +
                "ice  n 冰块," +
                "job  n  工作 职责," +
                "key n  关键 钥匙 键 答案 最重要的," +
                "lab  n  实验室 研究室 ," +
                "laboratory  n 实验室 化验室," +
                "magic n 魔法 魔术 神奇的 ," +
                "name n 名字 名称 名声  v 取名," +
                "objection  n  反对的，," +
                "pack v 包装 打包  n 商品的纸盒   adj 包装用的," +
                "package n 包裹 包 困 包装好的东西  v 包装 ，," +
                "packet n 数据包 小件包裹  ， v 把什么做成包裹," +
                "rabbit n 兔子 ," +
                "sacrifice n 牺牲  v 牺牲" );
         putWorlds("worlds3481_3500", "bank n 银行 ， 库存  ， 岸 ，河畔  ," +
                 "bankrupt adj 破产 倒闭  ，  n ," +
                 "council n 理事会 ， ," +
                 "fleet  n  舰队 车队  adj 快速的," +
                 "heel n 脚后跟 v 倾斜," +
                 "infant n 婴儿 ， adj 初创期 ," +
                 "heart n 心 心脏 核心," +
                 "heroic adj 英勇的 不畏艰难的," +
                 "gift n 礼物 赠品 天赋 ," +
                 "image n 图片 图像 影像," +
                 "imagenation  n 想象的事物," +
                 "imagine  v 设想 想象," +
                 "imaginary adj 想象中的 ，虚构的," +
                 "ashamed adj 羞愧的  忏愧的," +
                 "capable adj  有能力的 能力强的  能够胜任的," +
                 "business n 商务 生意," +
                 "yawn v 打哈欠 无趣的想法," +
                 "wholly adv  完全的 整体的 ," +
                 "swallow v  吞下  ， 花光钱  ," +
                 "talent n 人才 天资 天赋 " );
         putWorlds("worlds3461_3480", "," +
                 "3461 - 3480," +
                 "recover  v 康复 ," +
                 "recovery n 复苏 痊愈," +
                 "assume v 假设 认为 假装 ," +
                 "conceal v 隐藏 掩盖," +
                 "bring  v 带来 导致  ," +
                 "figure n 数字 图形 ," +
                 "fountain n 泉水 喷泉 ," +
                 "injure 损伤 损害," +
                 "," +
                 "audience  n 观众 读者 听众 ," +
                 "emotion n 情感 情绪 ," +
                 "emotional adj  感情的 情绪的 有感染力的," +
                 "graph  n 图标 曲线图 v 把什么汇入图标," +
                 "virtually  adv  事实上," +
                 "spim   v   旋转   n 快速旋转," +
                 "pursue  v 追求 追寻 追赶 ," +
                 "quite adv 很 非常," +
                 "noisy  adj 充满噪音的," +
                 "omit v  省略   ");
         putWorlds("worlds3441_3460", "," +
                 "3441 - 3460," +
                 "imitate  v 模仿 仿制," +
                 "ratio  n 比例 ," +
                 "rope n 绳索 v 用绳子捆绑," +
                 "proclaim  v 宣布 宣告 ， 明确标志 ， ," +
                 "," +
                 "seriously  adv  严 重的  严肃的的," +
                 "poverty n 平穷 贫困 ," +
                 "reply  v 答复 回答," +
                 "lonely  adv  孤单的 孤独的 寂寞的," +
                 "fit  v  形状或者尺寸合适的  与 一致的  ， 健壮的 健康的," +
                 "last adv 最后 最终 最新  last of something 最后的事情," +
                 "brute  n  残酷的人  ," +
                 "sack  n 解雇 开除 ," +
                 "arrive v 到达 抵达 送达 到来 问世 ," +
                 "slide  v  使滑行  逐渐降低 跌落  n 滑梯," +
                 "flexible  adj  灵活的  可变动的," +
                 "amuse  v 逗乐 娱乐 ," +
                 "temple  n  神殿 ," +
                 "quit  n 辞职 退出 ， 摆脱了什么 的");
         putWorlds("worlds3421_3440","," +
                 "3421 - 3440," +
                 "heal v 使康复   heal sb 治愈某人," +
                 "healthy  adj  健康的 健壮的 ," +
                 "virtue  n  高尚的道德 优秀的品质," +
                 "rubbish n 垃圾 废弃物  一文不值," +
                 "feel v 觉得 感到 意识到   触摸起来的感觉," +
                 "answer  n 答复 答案 解决方法 ," +
                 "bike  n  自行车   v 骑自行车," +
                 "situation  n 状况 情况 ," +
                 "birth  n 出生  诞生 分娩," +
                 "birthday  n 生日 ," +
                 "vex  使恼火," +
                 "statistical n 统计学的," +
                 "seller  n 销售方," +
                 "work  v 工作 干活  work for something  从事某工作," +
                 "distance n 距离 间距 两事物的差异  v 拉开距离 与某人疏远," +
                 "sunshine n 阳光 ," +
                 "react  v  起反应 对什么做出反应  对什么过敏 ," +
                 "least  adv  最少 微不足道 ," +
                 "tolerate v 容许 容忍 允许 ," +
                 "comfort  n 舒服   v 安慰 抚慰 " );
         putWorlds("worlds3401_3420","," +
                 "3401 - 3420 ," +
                 "button  n 底部," +
                 "indispensable  adj 必不可少的," +
                 "dispensable ," +
                 "directly  adv 直接的 立即 ," +
                 "scale n 规模 等级 社会等级体系  标度 刻度," +
                 "power n 力量 控制力 权势  ," +
                 "glass n 玻璃 玻璃杯  glasses 眼镜," +
                 "activity  n  活动 活跃 ," +
                 "social n 社会的  社交的," +
                 "bathroom  n 浴室 盥洗室 洗手间," +
                 "trail n 痕迹 足迹 乡间的小路  跟踪 追踪 植物蔓生," +
                 "tree  n 树 树木," +
                 "say v 说 讲 表述," +
                 "cart n 两轮或者四轮手推货车," +
                 "strictly  adv 严格地; (强调在一切情况都是如此) 绝对地，无论如何; 完全地; 确切地," +
                 "fresh adj 新鲜的 最新的," +
                 "environment  n 环境  周边的环境" );
         putWorlds("worlds3381_3400", "," +
                 "3381 - 3400," +
                 "reason  n 原因 解释 ," +
                 "reasonable adj 讲道理的 合情合理的 ," +
                 "slogan n 标语 口号 广告语," +
                 "clean v 干净的 清白的 整洁的 未用过的  n 打扫 清洁  adv 完全的," +
                 "toast n 烤面包片  v 为** 烤火," +
                 "dictate  v 命令 决定 要求  ," +
                 "elect  v 选择 选举 ," +
                 "election  n 选举权 当选," +
                 "winner n  获奖者 获胜者 冠军," +
                 "robot  n 机器人 ，自动机," +
                 "poor adj 贫穷的  n 穷人," +
                 "come  v 来 来到 抵达  变成 成为  ," +
                 "apologize  v 道歉 ," +
                 "physicist  n  物理学家," +
                 "physical adj  身体的 肉体的 物理学的  n 体检," +
                 "physician  n 内科医生," +
                 "rub  n 擦 摩擦," +
                 "score  n  比赛的得分  戏剧的配乐," +
                 "give  v 送给 给予 支付 告诉   ");
         putWorlds( "worlds3361_3380","," +
                 "3361 - 3380 ," +
                 "barber  n 理发师 理发店 ," +
                 "process  n 过程 ，步骤 变化过程 加工方法   v 处理  加工 ," +
                 "proceed  v 继续进行做  ， 做完某事后继续做  ," +
                 "procession n 行列 队伍 一系列 一长串 ," +
                 "evolution," +
                 "mathematics  adv  数学的  数学方面的 ," +
                 "math  n  数学 数学学科," +
                 "disk  n 圆盘 磁盘 光盘 ," +
                 "due  adj  预计的  预期的   ， due to 由于 ," +
                 "back  adv  在原处  返回 回到原处   n 后面  v 支持 使倒退," +
                 "odd  出人意料的," +
                 "gulf n  海湾  地面的裂口 ," +
                 "traitor  n  背叛者 卖国贼 ," +
                 "spaceship  n 航天飞船," +
                 "sustain  v 使保持 维持 ," +
                 "tooth  n 牙齿 齿状物," +
                 "swim  v 游泳 头晕眩   n 游泳," +
                 "similar  adj  相似的," +
                 "," +
                 "saving  n 结余 结余的钱  储蓄金" );
         putWorlds("worlds3341_3360","," +
                 "3341 - 3360 ," +
                 "radioactive  n  放射线 ," +
                 "blossom  v 开花 变得更加有魅力  n 花 花朵," +
                 "amplify  v  扩大 增强," +
                 "chore ," +
                 "domestic v 本国的  家庭的  n 佣人 ," +
                 "nor  也不 ," +
                 "compete  v  参与竞争," +
                 "competition n 竞争 竞赛 竞争  ," +
                 "major adj  主要的  n 少校  专业 主修课程 ," +
                 "overcome  v 克服 解决 战胜  ," +
                 "obey  v 服从 遵循 ," +
                 "tobacco  n 烟草 烟叶 ," +
                 "murderer  n  杀人犯 ," +
                 "bough n 大树枝 粗树枝," +
                 "perspective  n 思考问题的角度," +
                 "consider v 思考 认真思考 认为  把**当作," +
                 "medal  n 奖状 勋章  v 体育比赛获得奖牌 ," +
                 "prominent adj 出名的 ," +
                 "concept n 原则 概念 想法 "  );
         putWorlds("worlds3321_3340","," +
                 "3321 - 3340 ," +
                 "element   n 部分 部件 元素 ," +
                 "elementary adj  基本的 初级的 基础的 ," +
                 "lie   平躺   承担   ，说谎  n 谎话 ," +
                 "hold  v 抓住  ， 拥有  ，担任  ，控制  ， 在竞赛中保持记录 ，使保持某种状态," +
                 "course n 课程 教程  竞赛场地  场地  过程 航道 疗程  v 奔流 大量流动," +
                 "deepen v 加深 使变深  使加重  恶化," +
                 "treaty n 条约 ," +
                 "warn v 警告 提醒," +
                 "warning n 警告 提醒," +
                 "nursery n 托儿所 adj 幼儿教育的," +
                 "cargo  n 轮船或者飞机 装载的货物," +
                 "palm ," +
                 "turbulent adj 动荡的," +
                 "turbulence n 动荡 ," +
                 "combine v 使结合  使中和 使合并   n  联合体 集团," +
                 "combination n  联合 结合 中和 组合," +
                 "beggar  n 乞丐  v 使人极度贫穷," +
                 "," +
                 "beard  n 胡须  v 勇敢面对**人"  );
         putWorlds("worlds3301_3320", "," +
                 "3301 - 3320," +
                 "boundary n 分界线 边界," +
                 "date n 日期," +
                 "artist n 艺术家 画家  雕塑家 ," +
                 "ant  n 蚂蚁," +
                 "veil  n 面纱 笼罩物 ," +
                 "tenant n 租户 房客," +
                 "function  n 功能 用途   函数  起作用 ," +
                 "defect n 缺点 瑕疵 身体缺陷  v 脱离 叛逃 ," +
                 "ruin n 完全毁掉 糟蹋  身败名裂 v 使身败名裂 ," +
                 "zealous 热心的 ," +
                 "avoid  v 避开 逃避 ," +
                 "shine  v 照耀 发光  n 光彩 光亮," +
                 "attentive adj 专心的 全神贯注的 照顾周到的 ," +
                 "bet   v 打赌  n 猜想 想法," +
                 "utility  n 公用事业 有用性," +
                 "," +
                 "romantic adj 爱情的 浪漫的 ," +
                 "heavily  n 重重的 结实的 ," +
                 "weaken v 叫醒 "  );
         
         
         return true;
     }


     public static void addWorldsToStory_20191115(){
         putWorlds("worlds3281_3300", "" +
                         "impossible adj 不可能的 办不到的  n 不可能的事务" +
                         "professional adj 职业的 专业的  非常内行的  n 专家 内行" +
                         "disgust n 厌恶 反感 v" +
                         "substitute v 用 ** 代替  n 替代物" +
                         "roof  n 屋顶 车顶 盖子" +
                         "basket  n 篮子 篓子 购物篮 " +
                         "basketball  n 篮球 " +
                         "spectacle n 不寻常的事情  壮观的事" +
                         "born  v 出生  adj 天生的 命中注定的" +
                         "destruction  n 毁灭 破会" +
                         "fragment  n 碎片 " +
                         "shy  adj 害羞的 不足的 " +
                         "prescribe  v 规定 指定 开药 开处方 " +
                         "ground  n 地面 土壤 地域   领域" +
                         "crisis n 危机 极其困难的时期  危机时刻" +
                         "ghost n 鬼 幽灵 " +
                         "Sting  蚊虫叮咬 " +
                         "philosophy n 哲学  人生哲理 " +
                         "real adj 真正的 天然的 adv 非常 很 " +
                         "digital adj  数字的 数码的 "
                 );
         putWorlds("worlds3261_3280", "" +
                 "scope  n 范围 机会 " +
                 "socialist  n 社会主义  asj " +
                 "lighten  v 照亮  使明亮" +
                 "heavy adj 重的 剧烈的 大量的 " +
                 "love  v 爱 喜欢 n 爱 爱情 " +
                 "lovely adj 快乐的 愉快的 美丽的 友善的  n 漂亮女人" +
                 "lover  情人" +
                 "though  虽然 然而   adv 然而 " +
                 "reach  v 到达  抵达  够到  与某人取得联系   n 可到达的距离  " +
                 "bound adj 肯定的 必然的 受约束的 " +
                 "part n 部分 局部 临界 adv 部分的  " +
                 "fierce  adj 猛烈的 强烈的 " +
                 "town  n  城镇  市中心" +
                 "cry v 哭泣 流泪" +
                 "neither  adv 二者皆非 " +
                 "door  n 门 出入口 人家 住户 " +
                 "page  n 页面  书或者报纸的页" +
                 "start  v 开始 创办 出发 " +
                 "finger n （除了大拇指的）手指 指责 "

         );
         putWorlds("worlds3241_3260", "" +
                 "master  n   主人  大师  名家  硕士学位  精通 掌握  adj 技术熟练的" +
                 "fate  n 命运 " +
                 "distinct  adj 显著的 差别明显的" +
                 "distinguish v 区分 分辨 使有所区别" +
                 "quilt n 被子 被褥 " +
                 "procedure  n 程序 过程 手术 " +
                 "send  v 送 发送 邮寄 送走" +
                 "speaker  n 演讲者 发言者 扬声器 " +
                 "journal  n  杂志 日记 " +
                 "journalist  n 新闻记者 报纸撰稿人 广播人" +
                 "congratulate v 祝贺" +
                 "weekly  adj adv 每周一次的 周报" +
                 "haste v 急忙 " +
                 "spider  n 蛛蛛 " +
                 "intentional adj  故意的 有意的 " +
                 "clerk  n 售货员 接待员  v 担任文员 店员 " +
                 "seed  n 种子 萌芽 " +
                 ""


         );

         putWorlds("worlds3221_3240", "" +
                 "flow  v 流 流动  飘 n 流动  " +
                 "flower  n 花 花卉  v 开花 繁荣" +
                 "spear  n 毛  v 刺" +
                 "vase  n 花瓶" +
                 "massage  n 消息  v 发短信" +
                 "wait v 等待 等候 n 等待 期待" +
                 "" +
                 "faint adj 微弱了  n 晕倒  " +
                 "being  n 生物 存在  " +
                 "interpreter  n 口译人 " +
                 "fix  v 使固定  确定时间 n一次用量" +
                 "frighten  v 使害怕 使受惊" +
                 "diagram  n 图解 图标 视图 " +
                 "hasty adj 创促的 鲁莽的" +
                 "highly adv 高度地 地位高地" +
                 "high adj 高的  权位重要的" +
                 "leap v 跳 跳跃 快速提供帮助  快速提高  n 聚变  快速提高" +
                 "blame  v 责备" +
                 "participate  参加"
         );
         putWorlds("worlds3201_3220", "" +
                 "destroy  v 毁坏 宰杀 销毁 " +
                 "station  n 站 车站 站台 局  v 驻扎 " +
                 "jet  n 喷气式飞机  v 乘飞机旅行" +
                 "pulse n 脉搏  v 有规律的跳动" +
                 "productive  adj 富有成效的" +
                 "since  adv 此后  从  自从" +
                 "play v 玩 玩耍 捉弄 假装 装扮 演奏 播放" +
                 "playground  n  操场 运动场 " +
                 "entertainment  n 娱乐 " +
                 "law  n 法律学 规律" +
                 "lawyer n 律师 法学家 " +
                 "pudding  n 布丁 甜点  " +
                 "netall  n 金属制品" +
                 "refuse  n 拒绝" +
                 "thousand n 一千 " +
                 "fame n 名声 名望 " +
                 "empty adj 空的 无人的 空洞的 无意义的 " +
                 ""
         );
         putWorlds("worlds3181_3200", "" +
                 "sore  adj 痛的 疼痛的 " +
                 "barrel  n 桶 枪管 " +
                 "correction n 改正 修改 责罚 惩罚 " +
                 "curtain n 窗帘 帷幕 幕布 " +
                 "mail  n 邮件 信件  v 邮件 " +
                 "contract  n  契约 合同  v 使缩小" +
                 "measurable adj 可测量的 显著的" +
                 "bullet  n 子弹 " +
                 "knife n 小刀  v 用刀砍 刺" +
                 "candidate n 申请人 求职者 " +
                 "glow  v 发光 发热 " +
                 "grammatical adj 语法的 符合语法的 " +
                 "grammar n 语法 语法书" +
                 "compel v 强迫 逼迫 引发 " +
                 "jar  n 罐子  " +
                 "wander v 漫步 闲逛 走神 " +
                 "divorce n 离婚 分离 分割  v 与 离婚" +
                 "youth n 青年时期 " +
                 "television  n 电视 " +
                 "revolt v 反抗  n 反抗 " +
                 ""
         );
         putWorlds("worlds3161_3180", "" +
                 "associate  v 将 ** 与 ** 联系起来  n 朋友 同事  adj 非正式的" +
                 "association n 协会 团体 联合 联盟 " +
                 "source n 来源 出处 发源地  v 从** 获取" +
                 "evolution  n 演化 进化 发展 " +
                 "hazard n 危险物  v 冒险建议 冒险猜测  使遭遇危险" +
                 "arrange v 安排 准备 排练" +
                 "crystal n 水晶 水晶饰品 " +
                 "grocer n 店员 " +
                 "badminton  n 羽毛球  羽毛球运动" +
                 "acceleration  n 加速度 加快 帧数 " +
                 "health n 健康 状况 " +
                 "trend n 趋势 倾向 " +
                 "fold  v 折叠 对折  n 折线 折痕" +
                 "grace n 优美 通情达理 体面  v 使优美 为**增色" +
                 "graceful  adj  优美的 优雅的 有风度的 " +
                 "shout  v 大声说 大声呼喊  n 喊声 " +
                 "support v 支持  赞成 拥护 n 支撑物 " +
                 ""
         );
         putWorlds("worlds3141_3160", "" +
                 "management  n 管理 经验 安排 管理层" +
                 "manage  v 管理 掌管 " +
                 "manager  n 经理 管理人 " +
                 "elsewhere  adv  在别处 到别处 " +
                 "Swiss  n 瑞士 瑞士人" +
                 "Russian  adj  俄罗斯的 " +
                 "sphere  n 球  范围 圈 界 " +
                 "reluctant  adj  勉强的 不情愿的 " +
                 "passive  adj 被动的 消极的  " +
                 "seaman  n 海员 " +
                 "mute  v 减轻噪音 " +
                 "puppet n 木偶 玩偶 傀儡 " +
                 "lock  n 锁  水闸  v 锁上 锁定 " +
                 "static  adj 静止的 " +
                 "restriction  n  受约束的  " +
                 "restrict  v 约束 限制 妨碍 " +
                 "delicious  adj  美味的  " +
                 "fatigue  n 疲劳  v 使 极度疲劳" +
                 "brood  n 一窝雏鸟  v 担忧 " +
                 ""
         );
         putWorlds("worlds3121_3140", "" +
                 "revenge  n 报仇 报复 " +
                 "purpose  n 意图 意志 " +
                 "tap      v 连续的轻拍 n 龙头 " +
                 "explanation  n 解释 说明 " +
                 "explain  v 解释 " +
                 "dangerous  adj 危险的  不安全的 " +
                 "ignorant  adj 不知情的 愚昧的的 无知的 " +
                 "pair  n 一对 一双  v 与 配对" +
                 "satisfaction  adj 满意的" +
                 "unsatisfactory adj 不令人满意的" +
                 "veteran  n 经验丰富的人 " +
                 "bold  adj 勇敢的 无谓的 鲁莽的 大胆的 " +
                 "excess  n  过度  adj 多余的 额为的" +
                 "classical adj 古典的 传统的 典雅的 " +
                 "article  n 文章 报道 " +
                 "beauty  n 美丽 美人 好东西 好处 " +
                 "beautiful  adj 美丽的 " +
                 "grateful  adj  表示感谢的 感激的 " +
                 "cruel  adj  残忍的  令人痛苦的" +
                 "wicked  adj 恶劣的  顽皮的"
         );

         putWorlds("worlds3101_3120", "" +
                 "alone  adj adv  单独的 孤独的 " +
                 "arise v 发生 出现 " +
                 "refuge  n 避难 避难所 " +
                 "quarter  n 季度 " +
                 "neat  adj 整洁的  有条理的 巧妙的      " +
                 "sponsor  v 赞助 " +
                 "worship  v 崇拜 信仰  n 对上帝的敬奉" +
                 "drama  n 戏剧" +
                 "pump  n  泵  v 使用泵抽 " +
                 "unit  n  课程的单元 计量的单元 " +
                 "never adv 从不 永不 绝不 " +
                 "permit v 允许  n 许可证 " +
                 "permission  n 允许 许可 准许 " +
                 "badly  adv  严重的  差的  非常 嫉妒 " +
                 "bad  adj 坏的  不好的  劣质的 邪恶的  " +
                 "champion  n 冠军 优胜者  v 支持 捍卫  adj 优秀的 " +
                 "porch  n 门廊 走廊 " +
                 "rubber  n 橡皮  橡胶  橡胶制成的 "
         );

         putWorlds("worlds3081_3100", "" +
                 "thick  adj  厚的 粗壮的 茂密的 " +
                 "yesterday  n 昨天 " +
                 "upside-down  n 上下翻滚  乱七八糟" +
                 "let  v 让 任由 出租 " +
                 "pollution  n 污染 污染物 " +
                 "pollute v 弄脏 玷污 " +
                 "unless  除非  除了在什么的情况下 " +
                 "steel  n 钢铁 钢铁工业 " +
                 "guide n 指导性的事物  指导  v 指导 指引" +
                 "repeat v 重复 重说 重做 " +
                 "repeatedly adv 重复的 多次的 " +
                 "suspicion  n 怀疑 疑心" +
                 "suspicious adj 可疑的 " +
                 "suspect  v 猜测 怀疑 认为**可能 " +
                 "convince  v 说服 使信服 " +
                 "infect  感染 " +
                 "resource  n 资源  v 为什么提供资源 " +
                 "soon  adv 很快 马上 " +
                 "potential  adj  潜在的  n 潜能 "

         );

         putWorlds("worlds3061_3080", "" +
                 "complicated  adj  复杂的 " +
                 "complication  n 复杂化 " +
                 "bother  v 打扰 烦扰 " +
                 "occur  v 事故的发生 " +
                 "occurrence  n 发生的事  遭遇 " +
                 "secondly  adv 第二点 其次 " +
                 "cigarette  n 香烟 " +
                 "axis  n 中线  " +
                 "impact  n 冲击力 撞击力 " +
                 "nowhere  adv  没门 任何都不" +
                 "bloom  v 开花 绽放  n 花  花朵  风华正茂" +
                 "shirt  n  男士衬衫" +
                 "income  n 收入  " +
                 "weapon "
         );
     }

    public static void main(String[] args) {
        Boolean isSuccess = addWorlds();
        if(isSuccess){
            System.out.println("一共多少期："+WorldsStory.size());
            System.out.println(WorldsStory.get("worlds3301_3320").toString().replaceAll(",", "\n"));
        }

    }
}
