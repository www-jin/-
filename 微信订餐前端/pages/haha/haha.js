//index.js
//获取应用实例
const app = getApp()

Page({
  data: {
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
        storeImgUrl: '/images/dianpu.jpg',
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
        storeImgUrl: '/images/dianpu.jpg',
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
        storeImgUrl: '/images/dianpu.jpg',
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
    }]
  },
  //事件处理函数
  onPullDownRefresh: function () {
    console.log('下拉刷新');
  },
  onLoad: function () {
    if (app.globalData.userInfo) {
      this.setData({
        userInfo: app.globalData.userInfo,
        hasUserInfo: true
      })
    } else if (this.data.canIUse) {
      // 由于 getUserInfo 是网络请求，可能会在 Page.onLoad 之后才返回
      // 所以此处加入 callback 以防止这种情况
      app.userInfoReadyCallback = res => {
        this.setData({
          userInfo: res.userInfo,
          hasUserInfo: true
        })
      }
    } else {
      // 在没有 open-type=getUserInfo 版本的兼容处理
      wx.getUserInfo({
        success: res => {
          app.globalData.userInfo = res.userInfo
          this.setData({
            userInfo: res.userInfo,
            hasUserInfo: true
          })
        }
      })
    }
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
 onLoad: function () {
    var config = (wx.getStorageSync("config"));
    var that = this
    console.log(config.store_url),

      wx.request({
      url: config.store_url,
        success: function (res) {
          that.setData({

            storeList: res.data
          })
        }
      })
  }
})