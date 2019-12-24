// pages/list/list.js
const app = getApp()
Page({
  data: {
    inputShowed: false,
    inputVal: "",
    swiperCurrent: 0,
    logoWidth:"",
    indicatorDots: true,

    autoplay: true,

    interval: 3000,

    duration: 800,
    grids: [{} ,{},{}
    ],
    motto: 'Hello World',
    userInfo: {},
    hasUserInfo: false,
    showFixed: false,
    sortHeight: 0,
    sortIndex: 0,
    sortListIndex: 0,
    showSort: false,
    scrollFixedTop: 0,
    canIUse: wx.canIUse('button.open-type.getUserInfo'),
    sortItem: ['综合排序', '距离最近', '评分最高', '起送价最低', '配送费最低', '人均高到低', '人均低到高'],
   
    // 1.满减
    // 2.新店优惠
    // 3.折扣商品
    // 4.满返代金券
    // 5.新用户
    // 6.减配送费
    // 7.领代金券
    // 8.赠送商品
    storeList: [{
      storeId: 1,
      storeName: '竹林香米线',
      storeImgurl: '/images/dianpu.jpg',
      score: 4.4,
      salemonth: 835,
      mindelprice: 0,
      delprice: 5,
      averageprice: 15,
      deltime: 30,
      service: ['支持自取'],
      actives: [{
        activeId: 1,
        acticeText: '满20减10；满200减20；满1000减50；满1000减50'
      },
      {
        activeId: 2,
        acticeText: '本店新用户立减1元'
      },
      {
        activeId: 3,
        acticeText: '折扣商品9折起'
      }
      ]
    }, {
      storeId: 2,
      storeName: '卖旺烤鸭',
      storeImgurl: '/images/dianpu.jpg',
      score: 3.0,
      saleMonth: 835,
      minDelPrice: 0,
      delPrice: 5,
      averagePrice: 15,
      delTime: 30,
      service: ['支持自取', '货到付款'],
      actives: [{
        activeId: 1,
        acticeText: '满20减10；满200减20'
      },
      {
        activeId: 2,
        acticeText: '本店新用户立减1元'
      }
      ]
    }, {
      storeId: 3,
      storeName: '肯德基',
        storeImgurl: '/images/dianpu.jpg',
      score: 3.0,
      saleMonth: 835,
      minDelPrice: 0,
      delPrice: 5,
      averagePrice: 15,
      delTime: 30,
      service: ['支持自取', '货到付款'],
      actives: [{
        activeId: 1,
        acticeText: '满20减10；满200减20'
      },
      {
        activeId: 2,
        acticeText: '本店新用户立减1元'
      }, {
        activeId: 3,
        acticeText: '折扣商品9折起'
      }, {
        activeId: 4,
        acticeText: '折扣商品9折起'
      }
      ]
    }, {
      storeId: 4,
      storeName: '星星炸鸡',
        storeImgurl: '/images/dianpu.jpg',
      score: 3.0,
      saleMonth: 835,
      minDelPrice: 0,
      delPrice: 5,
      averagePrice: 15,
      delTime: 30,
      service: ['支持自取', '货到付款'],
      actives: [{
        activeId: 1,
        acticeText: '满20减10；满200减20'
      },
      {
        activeId: 2,
        acticeText: '本店新用户立减1元'
      }
      ]
    }],

    circular: true,
    listData:[
      
        { "code": "01", "text": "text1", "type": "type1" },
        { "code": "02", "text": "text2", "type": "type2" },
        { "code": "03", "text": "text3", "type": "type3" },
       
      
    ],
    imgUrls: [
      'images/1.jpg',
      'images/2.jpg',
      'images/3.jpg',
    ],
     
    links: [

      '../user/user',

      '../user/user',

      '../user/user'

    ]

  },
  showInput: function () {
    this.setData({
      inputShowed: true
    });
  },
  hideInput: function () {
    this.setData({
      inputVal: "",
      inputShowed: false
    });
  },
  clearInput: function () {
    this.setData({
      inputVal: ""
    });
  },
  inputTyping: function (e) {
    this.setData({
      inputVal: e.detail.value
    });
  },

  swiperChange: function (e) {

    this.setData({

      swiperCurrent: e.detail.current

    })

  },

  //点击指示点切换

  chuangEvent: function (e) {

    this.setData({

      swiperCurrent: e.currentTarget.id

    })

  },

  //点击图片触发事件

  swipclick: function (e) {

    console.log(this.data.swiperCurrent);

    wx.switchTab({

      url: this.data.links[this.data.swiperCurrent]

    })

  },
  onReady: function (e) {
    let height;
    let res = wx.getSystemInfoSync();
    let winHeight = res.windowHeight;
    let query = wx.createSelectorQuery();
    query.select('.tabs').boundingClientRect();
    query.exec((res) => {
      height = res[0].height;
      this.setData({
        sortHeight: winHeight - height,
        scrollFixedTop: res[0].top
      })
    })
  },
  onPageScroll: function (e) {
    if (e.scrollTop >= this.data.scrollFixedTop && !this.data.showFixed) {
      this.setData({
        showFixed: true
      })
    } else if (e.scrollTop < this.data.scrollFixedTop && this.data.showFixed) {
      this.setData({
        showFixed: false
      })
    }
  },
  getUserInfo: function (e) {
    console.log(e)
    app.globalData.userInfo = e.detail.userInfo
    this.setData({
      userInfo: e.detail.userInfo,
      hasUserInfo: true
    })
  },
  select(id) {
    wx.navigateTo({
      url: `../store/store?storeId=${id}`
    })
  },
  getTabsInfo(e) {
    wx.pageScrollTo({
      scrollTop: e.target.offsetTop - 1,
      duration: 300
    })
    setTimeout(() => {
      if (e.target.dataset.index == 0) {
        this.setData({
          showSort: !this.data.showSort
        })
      }
      if (e.target.dataset.index) {
        this.setData({
          showFixed: true,
          sortIndex: e.target.dataset.index
        })
      }
    }, 350)
  },
  getFixedTabsInfo(e) {
    if (e.target.dataset.index) {
      this.setData({
        sortIndex: e.target.dataset.index
      })
    }
    if (e.target.dataset.index == 0) {
      this.setData({
        showSort: !this.data.showSort
      })
    } else {
      this.setData({
        showSort: false
      })
    }
  },
  move() { },
  selectSort(e) {
    if (e.target.dataset.sortindex || e.target.dataset.sortindex == 0) {
      this.setData({
        sortListIndex: e.target.dataset.sortindex,
        showSort: false
      })
    } else {
      this.setData({
        showSort: false
      })
    }
  },
  onPullDownRefresh: function () {
    console.log('下拉刷新');
  },
  onLoad:function(){
    var config = (wx.getStorageSync("config"));
    var that = this
    console.log(config.list_url),
    
    wx.request({
      url: config.list_url,
      success: function (res) {
        that.setData({
               
          grids: res.data
        })
      }
      
    })
     wx.request({
       url: config.store_url,
       success:function(res){
          that.setData({
            storeList:res.data
          })
       }
     })
  }

});
