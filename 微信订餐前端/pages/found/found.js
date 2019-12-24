// pages/order/order.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    currtab: 0,
    swipertab: [{ name: '推荐', index: 0 }, { name: '美食', index: 1 }, { name: '圣地', index: 2 }],
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {

  },
  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {
    // 页面渲染完成
    this.getDeviceInfo()
    this.orderShow()
  },

  getDeviceInfo: function () {
    let that = this
    wx.getSystemInfo({
      success: function (res) {
        that.setData({
          deviceW: res.windowWidth,
          deviceH: res.windowHeight
        })
      }
    })
  },

  /**
  * @Explain：选项卡点击切换
  */
  tabSwitch: function (e) {
    var that = this
    if (this.data.currtab === e.target.dataset.current) {
      return false
    } else {
      that.setData({
        currtab: e.target.dataset.current
      })
    }
  },

  tabChange: function (e) {
    this.setData({ currtab: e.detail.current })
    this.orderShow()
  },

  orderShow: function () {
    let that = this
    switch (this.data.currtab) {
      case 0:
        that.alreadyShow()
        break
      case 1:
        that.waitPayShow()
        break
      case 2:
        that.lostShow()
        break
    }
  },
  alreadyShow: function () {
    this.setData({
      alreadyOrder: [{ name: "", state: "", time: "", status: "", url: "", money: "" }, { name: "", state: "", time: "", status: "", url: "", money: "" }]
    })
  },

  waitPayShow: function () {
    this.setData({
      waitPayOrder: [{ name: "", state: "", time: "", status: "", url: "", money: "" }],
    })
  },

  lostShow: function () {
    this.setData({
      lostOrder: [{ name: "", state: "", time: "", status: "", url: "", money: "" }],
    })
  },


})