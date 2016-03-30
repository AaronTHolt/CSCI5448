/****************************************************************************
** Meta object code from reading C++ file 'ex01opengl.h'
**
** Created by: The Qt Meta Object Compiler version 63 (Qt 4.8.6)
**
** WARNING! All changes made in this file will be lost!
*****************************************************************************/

#include "ex01opengl.h"
#if !defined(Q_MOC_OUTPUT_REVISION)
#error "The header file 'ex01opengl.h' doesn't include <QObject>."
#elif Q_MOC_OUTPUT_REVISION != 63
#error "This file was generated using the moc from 4.8.6. It"
#error "cannot be used with the include files from this version of Qt."
#error "(The moc has changed too much.)"
#endif

QT_BEGIN_MOC_NAMESPACE
static const uint qt_meta_data_Ex01opengl[] = {

 // content:
       6,       // revision
       0,       // classname
       0,    0, // classinfo
       5,   14, // methods
       0,    0, // properties
       0,    0, // enums/sets
       0,    0, // constructors
       0,       // flags
       1,       // signalCount

 // signals: signature, parameters, type, tag, flags
      17,   12,   11,   11, 0x05,

 // slots: signature, parameters, type, tag, flags
      36,   33,   11,   11, 0x0a,
      51,   33,   11,   11, 0x0a,
      76,   71,   11,   11, 0x0a,
      91,   33,   11,   11, 0x0a,

       0        // eod
};

static const char qt_meta_stringdata_Ex01opengl[] = {
    "Ex01opengl\0\0text\0angles(QString)\0on\0"
    "setShader(int)\0setPerspective(int)\0"
    "type\0setObject(int)\0setLighting(int)\0"
};

void Ex01opengl::qt_static_metacall(QObject *_o, QMetaObject::Call _c, int _id, void **_a)
{
    if (_c == QMetaObject::InvokeMetaMethod) {
        Q_ASSERT(staticMetaObject.cast(_o));
        Ex01opengl *_t = static_cast<Ex01opengl *>(_o);
        switch (_id) {
        case 0: _t->angles((*reinterpret_cast< QString(*)>(_a[1]))); break;
        case 1: _t->setShader((*reinterpret_cast< int(*)>(_a[1]))); break;
        case 2: _t->setPerspective((*reinterpret_cast< int(*)>(_a[1]))); break;
        case 3: _t->setObject((*reinterpret_cast< int(*)>(_a[1]))); break;
        case 4: _t->setLighting((*reinterpret_cast< int(*)>(_a[1]))); break;
        default: ;
        }
    }
}

const QMetaObjectExtraData Ex01opengl::staticMetaObjectExtraData = {
    0,  qt_static_metacall 
};

const QMetaObject Ex01opengl::staticMetaObject = {
    { &QGLWidget::staticMetaObject, qt_meta_stringdata_Ex01opengl,
      qt_meta_data_Ex01opengl, &staticMetaObjectExtraData }
};

#ifdef Q_NO_DATA_RELOCATION
const QMetaObject &Ex01opengl::getStaticMetaObject() { return staticMetaObject; }
#endif //Q_NO_DATA_RELOCATION

const QMetaObject *Ex01opengl::metaObject() const
{
    return QObject::d_ptr->metaObject ? QObject::d_ptr->metaObject : &staticMetaObject;
}

void *Ex01opengl::qt_metacast(const char *_clname)
{
    if (!_clname) return 0;
    if (!strcmp(_clname, qt_meta_stringdata_Ex01opengl))
        return static_cast<void*>(const_cast< Ex01opengl*>(this));
    return QGLWidget::qt_metacast(_clname);
}

int Ex01opengl::qt_metacall(QMetaObject::Call _c, int _id, void **_a)
{
    _id = QGLWidget::qt_metacall(_c, _id, _a);
    if (_id < 0)
        return _id;
    if (_c == QMetaObject::InvokeMetaMethod) {
        if (_id < 5)
            qt_static_metacall(this, _c, _id, _a);
        _id -= 5;
    }
    return _id;
}

// SIGNAL 0
void Ex01opengl::angles(QString _t1)
{
    void *_a[] = { 0, const_cast<void*>(reinterpret_cast<const void*>(&_t1)) };
    QMetaObject::activate(this, &staticMetaObject, 0, _a);
}
QT_END_MOC_NAMESPACE
