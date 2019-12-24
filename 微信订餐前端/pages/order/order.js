// pages/order/order.js

Page({

  /**
   * 页面的初始数据
   */
  data: {
    currtab: 0,
    swipertab: [{ name: '已完成', index: 0 }, { name: '待付款', index: 1 }, { name: '已取消', index: 2 }],
  },

  /**
   * 生命周期函数--监听页面加载
   */
 
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
        var config = (wx.getStorageSync("config"));
        wx.request({
          url: config.order_url,
          success: function (res) {
            that.setData({

              alreadyOrder: res.data
            })
          }
        })
        that.alreadyShow()
        break
      case 1:
        that.waitPayShow()
        var config = (wx.getStorageSync("config"));
        wx.request({
          url: config.order1_url,
          success: function (res) {
            that.setData({

              waitPayOrder: res.data
            })
          }
        })
        break
      case 2:
        that.lostShow()
        var config = (wx.getStorageSync("config"));
        wx.request({
          url: config.order2_url,
          success: function (res) {
            that.setData({

              lostOrder: res.data
            })
          }
        })
        break
    }
  },
  alreadyShow: function () {

    this.setData({

      alreadyOrder: [{ }]
    })
  },

  waitPayShow: function () {
    this.setData({
      waitPayOrder: [{ name: "速味居", state: "待付款", time: "2018-10-14 14:00-16:00", status: "未开始", url: "../list/images/daishu.png", money: "186" }],
    })
  },

  lostShow: function () {
    this.setData({
      lostOrder: [{ name: "速味居", state: "已取消", time: "2018-10-4 10:00-12:00", status: "未开始", url: "../list/images/meishi.png", money: "122" }],
    })
  },
  


})